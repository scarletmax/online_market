package com.cykj.online_market_admin.service;

import com.cykj.online_market_bean.pojo.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenu(int roleId);
}
