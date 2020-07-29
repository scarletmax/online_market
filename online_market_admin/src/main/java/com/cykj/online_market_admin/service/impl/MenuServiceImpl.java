package com.cykj.online_market_admin.service.impl;

import com.cykj.online_market_admin.mapper.MenuMapper;
import com.cykj.online_market_admin.service.MenuService;
import com.cykj.online_market_bean.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> getMenu(int roleId) {
        return menuMapper.getMenu(roleId);
    }
}
