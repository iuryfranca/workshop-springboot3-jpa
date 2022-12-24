package com.course.coursesprintboot3.repositories;

import com.course.coursesprintboot3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
