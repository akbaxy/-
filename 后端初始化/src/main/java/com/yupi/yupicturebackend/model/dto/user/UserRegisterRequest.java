package com.yupi.yupicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 3208705147706979068L;
    private String userAccount;//用户账号
    private String userPassword;//用户密码
    private String checkPassword;//确认密码
}
