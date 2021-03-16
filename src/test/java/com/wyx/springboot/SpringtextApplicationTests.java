package com.wyx.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wyx.springboot.entity.Master;
import com.wyx.springboot.entity.Student;
import com.wyx.springboot.mapper.StudentMapper;
import com.wyx.springboot.utils.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringtextApplicationTests {

    @Resource
    StudentMapper studentMapper;

    @Test
    void contextLoads() {
        List<Student> list = studentMapper.selectList(null);
        System.out.println(123);
    }

    @Test
    /*显示学生信息*/
    public void show(){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.notLike("studentNo",3)
                .orderByDesc("studentNo");
        List<Student> list =  studentMapper.selectList(queryWrapper);
    }

    @Test
    /*查找全部学生*/
    public void find(){
        studentMapper.findAll();
    }

    @Test
    /*修改学生信息*/
    public void update() {
        studentMapper.update("liukuang", 10002);
    }


    @Autowired
    /*创建redisutil对象*/
    RedisUtil redisUtil;
    /*赋值 传值*/
    @Test
    public void test1(){
        redisUtil.set("height",18);
    }

    /**
     * 通过RedisTemplate取值
     * 上机1
     */
    @Test
    public void test2(){
        System.out.println(redisUtil.get("age"));
    }

    /**
     * 在redis中插入一个对象,然后插入一个集合,查看两组数据的区别
     * 上机2
     */
    @Test
    public void test3(){
        Student student = new Student();
        student.setPhone("123");
        redisUtil.set("a",student);
        redisUtil.lSet("b",456);
    }


    /**
     * 给对象和集合数据设置过期时间,检测到期后是否会自动消失
     * 上机3
     */
    @Test
    public void test4(){
        redisUtil.expire("a",10);
        redisUtil.expire("b",10);
    }

    /**
     * 通过hset向redis插入数据,检测和String类型的区别
     * 上机4
     */
    @Test
    public void test5(){
       redisUtil.hset("hash","name","wang");
       redisUtil.set("string","wang2");
       //System.out.println(redisUtil.hget("hash","name"));
    }

    /**
     * 将一组集合添加到list和set类型中,然后分别打印,检测区别
     * 上机5
     */
    @Test
    public void Test05(){
        Master master1 = new Master();
        master1.setName("小红");
        master1.setPassword("123456");
        List<Master> list = new ArrayList<>();
        list.add(master1);
        redisUtil.lSet("list",list);
        redisUtil.sSet("sSet",list);

        System.out.println(redisUtil.lGet("list", 0, -1));
        System.out.println(redisUtil.sGet("sSet"));
    }



}
