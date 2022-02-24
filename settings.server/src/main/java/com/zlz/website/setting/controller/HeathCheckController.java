package com.zlz.website.setting.controller;

import com.zlz.website.common.dos.UserDO;
import com.zlz.website.setting.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务健康检查接口
 *
 * @author zhulinzhong
 * @date 2022-02-21 19:29:24
 */
@RestController
public class HeathCheckController {

    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/health")
    public String healthCheck() {
        return "health";
    }

    @GetMapping("/user")
    public List<UserDO> getUser(@RequestParam("name")String name){
        if(null == name){
            return new ArrayList<>();
        }
        return usersMapper.getUsers(name);
    }
}
