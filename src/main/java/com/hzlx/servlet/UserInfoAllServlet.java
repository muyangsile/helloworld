package com.hzlx.servlet;

import com.google.gson.Gson;
import com.hzlx.dao.UserInfoDao;
import com.hzlx.dao.impl.UserInfoDaoImpl;
import com.hzlx.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author 哈喽沃德
 * @version 1.0.0
 * @title UserInfoAllServlet
 * @description <TODO description class purpose>
 * @createTime 2023/6/19 10:42
 **/
@WebServlet("/userAll")
public class UserInfoAllServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserInfoDao userInfoDao=new UserInfoDaoImpl();
        List<UserInfo> userList = userInfoDao.getUserInfoAll();
        //设置响应编码格式为 utf-8
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write(new Gson().toJson(userList));
    }
}
