package com.hzlx.dao;

import com.hzlx.entity.UserInfo;

import java.util.List;

/**
 * @author 哈喽沃德
 * @version 1.0.0
 * @title UserInfoDao
 * @description <TODO description class purpose>
 * @createTime 2023/6/19 10:36
 **/
public interface UserInfoDao {
    List<UserInfo> getUserInfoAll();
}
