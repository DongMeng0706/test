package com.example.test.service;

import com.example.test.bean.UserBean;

/**
 * @Author:dm
 * @Date:2020/10/3 10:59
 * @Description:
 */
public interface UserService {

    UserBean loginIn(String name, String password);
}
