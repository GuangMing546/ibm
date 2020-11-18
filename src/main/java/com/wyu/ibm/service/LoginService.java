package com.wyu.ibm.service;

import com.wyu.ibm.entity.LoginBean;
import com.wyu.ibm.util.LoginResult;

public interface LoginService {
    public LoginResult checkLogin(LoginBean loginBean);
}
