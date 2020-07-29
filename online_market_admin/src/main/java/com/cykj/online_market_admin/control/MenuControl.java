package com.cykj.online_market_admin.control;

import com.cykj.online_market_admin.service.MenuService;
import com.cykj.online_market_bean.pojo.Admin;
import com.cykj.online_market_bean.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/menuControl")
public class MenuControl {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/getMenu")
//    @Log(operationType = "查看",operationName = "")
    //获得菜单
    public String getMenu(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("菜单方法");
        Admin admin= (Admin)request.getSession().getAttribute("admin");
        int roleId=admin.getRoleId();
        List<Menu> menuList= menuService.getMenu(roleId);
        request.setAttribute("menuList",menuList);
        return "/jsp/main.jsp";
    }


}
