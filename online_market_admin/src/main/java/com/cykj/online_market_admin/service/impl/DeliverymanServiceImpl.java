package com.cykj.online_market_admin.service.impl;

import com.alibaba.fastjson.JSON;
import com.cykj.online_market_admin.mapper.DeliverymanMapper;
import com.cykj.online_market_admin.service.DeliverymanService;
import com.cykj.online_market_bean.pojo.Deliveryman;
import com.cykj.online_market_bean.pojo.LayData;
import org.apache.tomcat.jni.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@Service("deliverymanService")
public class DeliverymanServiceImpl implements DeliverymanService {
    @Autowired
    private DeliverymanMapper deliverymanMapper;

    @Override
    public LayData<Deliveryman> showTable(HashMap<String, Object> condition) {
        List<Deliveryman> deliverymanList = deliverymanMapper.queryDeliveryman(condition);
        int totalCount = deliverymanMapper.queryCount(condition);
        return new LayData<Deliveryman>(0, "", totalCount, deliverymanList);

    }

    @Override
    public boolean updateState(int id, String state) {
            int result = 0;
            //更新派送员状态
            result = deliverymanMapper.updateState(id, state);
            return result > 0;

    }

    @Override
    public List<String> getAllState() {
        return deliverymanMapper.getAllState();
    }
}
