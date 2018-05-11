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
		System.out.println("addOrder1:"+id);
	}

	@Override
	public void modifyOrder(int id)  {
		System.out.println("modifyOrder1"+id);
	}

	@Override
	public void deleteOrder() {
		System.out.println("deleteOrder1");
	}
}
