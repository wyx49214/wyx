package com.wyx.springboot.utils.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisConnection {

    @Test
    public void test(){
        Jedis jedis = new Jedis("192.168.32.130", 6380);
        //jedis.auth("123456");
        jedis.connect();
        System.out.println("连接成功");

        String username = jedis.get("name");
        String love = jedis.get("love");
        //jedis.set("password", "654321");
        jedis.expire("name", 10);//删除键
        System.out.println(username);
        System.out.println(love);

        jedis.disconnect();
        System.out.println("连接关闭");
    }


}
