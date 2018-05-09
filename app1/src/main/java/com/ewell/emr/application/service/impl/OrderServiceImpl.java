package com.ewell.emr.application.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ewell.emr.application.service.IOrderService;
import com.ewell.emr.domain.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version="1.0")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    IOrderRepository orderRepository;
    @Override
    public void add(int id) {
        orderRepository.addOrder(id);
    }
}
