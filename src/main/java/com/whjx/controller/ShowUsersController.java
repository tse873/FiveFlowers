package com.whjx.controller;

import com.whjx.pojo.UserInfo;
import com.whjx.service.impl.ShowUsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowUsersController {
    @Autowired
    private ShowUsersServiceImpl showUsersService;

    @CrossOrigin
    @GetMapping("/showUsers")
    public List<UserInfo> showUsers(){
        return showUsersService.showUser();
    }
}
