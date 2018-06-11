package com.liwei.emr.application.service.app1.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liwei.emr.application.service.app1.IOrderService;
import com.liwei.emr.domain.repository.IOrderRepository;
import com.liwei.emr.application.service.app1.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(version="1.0")
@Component
public class OrderServiceImpl implements IOrderService {

    @Autowired
    IOrderRepository orderRepository;
    @Override
    public void add(int id) {
        orderRepository.addOrder(id);
    }

    @Override
    public void modify(int id) {
        orderRepository.modifyOrder(id);
    }
}
