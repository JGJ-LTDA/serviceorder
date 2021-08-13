package com.jgj.serviceorder.datasource.repository;

import com.jgj.serviceorder.datasource.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    Optional<OrderEntity> findByUuid(UUID uuidOrder);
}
