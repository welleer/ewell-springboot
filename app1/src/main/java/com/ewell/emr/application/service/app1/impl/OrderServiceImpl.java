package com.ewell.emr.application.service.app1.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ewell.emr.application.service.app1.IOrderService;
import com.ewell.emr.domain.repository.IOrderRepository;
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
