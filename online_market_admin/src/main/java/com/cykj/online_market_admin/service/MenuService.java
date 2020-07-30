package com.cykj.online_market_admin.service;

import com.cykj.online_market_bean.pojo.AttrMsg;
import com.cykj.online_market_bean.pojo.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu(int roleId);
    //查询已分配和未分配菜单
    public AttrMsg queryAttr(int roleId);
    //移除已分配的菜单
    public boolean removeAttr(int roleId,String arr);
    //分配新的菜单
    public boolean newAttr(int roleId,String arr);
}
