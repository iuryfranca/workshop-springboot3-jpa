package com.course.coursesprintboot3.repositories;

import com.course.coursesprintboot3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
