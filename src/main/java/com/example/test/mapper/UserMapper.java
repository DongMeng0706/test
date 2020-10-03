package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:dm
 * @Date:2020/10/3 10:57
 * @Description:
 */
public interface UserMapper {

    UserBean getInfo(@Param("name") String name, @Param("password") String password);
}
