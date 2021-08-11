package com.jgj.serviceorder.datasource.repository;

import com.jgj.serviceorder.datasource.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
