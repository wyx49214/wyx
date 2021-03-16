package com.wyx.springboot.service.impl;

import com.wyx.springboot.entity.Subject;
import com.wyx.springboot.mapper.SubjectMapper;
import com.wyx.springboot.service.ISubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-09
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements ISubjectService {

}
