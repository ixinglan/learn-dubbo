package com.freedom.gmall.service;

import com.freedom.gmall.bean.UserAddress;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
