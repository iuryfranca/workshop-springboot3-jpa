package com.course.coursesprintboot3.repositories;

import com.course.coursesprintboot3.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
