package com.demo.controller;

import com.demo.domain.HttpResult;
import com.demo.domain.User;
import com.demo.service.UserService;



import com.demo.utils.TestUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * @Auther: fanyao
 * @Date: 2019/3/21 11:25
 * @Description:
 */
@Controller
@RequestMapping("/user")
@Api("用户接口类")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;



    @ApiOperation(value = "根据id查询用户信息", notes = "查询数据库中某个的用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", paramType = "path", required = true, dataType = "Long")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User selectById(@PathVariable Long id) {
        logger.info("id:", id);
        User user = userService.selectById(id);
        return user;
    }

    @ResponseBody
    @ApiOperation(value = "添加用户", notes = "添加用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", paramType = "query", required = false, dataType = "Long"),
            @ApiImplicitParam(name = "name", value = "用户名称", paramType = "query", required = true, dataType = "string")
    })
    @RequestMapping(value = "/{addUser}", method = RequestMethod.POST)
    public HttpResult addUser(User user) {


        if (null == user.getCreateTime()) {
            user.setCreateTime(new Date());
        }
        try {
            user.setCreateTime(new Date());

         //   userService.saveUser(user);

            return new HttpResult(200, "添加成功");
        } catch (Exception e) {

            return new HttpResult(0, "添加失败 " + e.getMessage());
        }

    }




}
