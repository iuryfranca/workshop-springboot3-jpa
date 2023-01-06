package com.course.coursesprintboot3.repositories;

import com.course.coursesprintboot3.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
