package com.jay.code.controller;

import com.jay.code.entity.User;
import com.jay.code.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jay.fang
 * @since 2022-06-30
 */
@Api("用户控制层")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @ApiOperation("查询人员列表")
    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.list();
    }

    @ApiOperation("查询单个人员")
    @ApiImplicitParam(name = "id", value = "人员id", required = true)
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getById(id);
    }

}
