package com.liwei.emr.domain.repository;

public interface IOrderRepository {

    void addOrder(int id);

    void modifyOrder(int id);

    void deleteOrder();
}
