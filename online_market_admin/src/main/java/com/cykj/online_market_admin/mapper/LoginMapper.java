package com.cykj.online_market_admin.mapper;

import com.cykj.online_market_bean.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //管理员登录
    Admin login(Admin admin);
}
