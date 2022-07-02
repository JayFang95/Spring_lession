package com.jay.code.service.impl;

import com.jay.code.entity.User;
import com.jay.code.mapper.UserMapper;
import com.jay.code.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jay.fang
 * @since 2022-06-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
