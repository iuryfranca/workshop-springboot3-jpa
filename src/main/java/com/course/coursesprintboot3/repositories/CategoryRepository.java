package com.course.coursesprintboot3.repositories;

import com.course.coursesprintboot3.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
