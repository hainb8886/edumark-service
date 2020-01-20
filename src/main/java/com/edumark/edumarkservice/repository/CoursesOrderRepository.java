package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.CoursesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesOrderRepository extends JpaRepository<CoursesOrder,Long> {
    
}
