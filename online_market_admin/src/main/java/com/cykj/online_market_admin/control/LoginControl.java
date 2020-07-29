package com.cykj.online_market_admin.control;

import com.alibaba.fastjson.JSON;
import com.cykj.online_market_admin.service.LoginService;
import com.cykj.online_market_bean.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/loginControl")
public class LoginControl {
    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/login")
    @ResponseBody
//    @Log(operationType = "操作",operationName = "管理员登录")
    //管理员登录
    public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String adminJson = request.getParameter("adminJson");
        System.out.println(adminJson);
        Admin userAdmin = JSON.parseObject(adminJson, Admin.class);
        Admin admin= loginService.login(userAdmin);
        if (admin != null) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", admin);
            request.getSession().setAttribute("isLogin", true);
            return "success";
        } else {
            return "error";
        }
    }
}
