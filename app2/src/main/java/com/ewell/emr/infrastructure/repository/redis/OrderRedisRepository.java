package com.ewell.emr.infrastructure.repository.redis;

import com.ewell.emr.domain.repository.IOrderRepository;
import org.springframework.stereotype.Repository;

/**
 * @createdate 2017年9月23日
 */
@Repository
public class OrderRedisRepository implements IOrderRepository {


	@Override
	public void addOrder(int id) {
		System.out.println("addOrder:"+id);
	}

	@Override
	public void modifyOrder() {
		System.out.println("modifyOrder");
	}

	@Override
	public void deleteOrder() {
		System.out.println("deleteOrder");
	}
}
