package com.ewell.emr.application.service.app2.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ewell.emr.application.service.app2.IOrder2Service;
import com.ewell.emr.domain.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version="1.0")
public class Order2ServiceImpl implements IOrder2Service {

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
