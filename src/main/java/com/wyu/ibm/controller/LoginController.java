package com.wyu.ibm.controller;

import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.service.impl.LoginServiceImpl;
import com.wyu.ibm.util.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class LoginController {
    @Autowired
    LoginServiceImpl loginService;

    @PostMapping("/login")
    public LoginResult login(@RequestBody LoginBean loginBean){
        return loginService.checkLogin(loginBean);
    }
}
