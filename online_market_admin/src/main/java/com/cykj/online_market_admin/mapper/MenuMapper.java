package com.cykj.online_market_admin.mapper;

import com.cykj.online_market_bean.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenu(int roleId);
}
