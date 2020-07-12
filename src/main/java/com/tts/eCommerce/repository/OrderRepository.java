package com.tts.eCommerce.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tts.eCommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	@Override
	public Optional <Order> findById(Long orderId);
}
