package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.CoursesCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesCategoryRepository extends JpaRepository<CoursesCategory, Long> {
    @Modifying(clearAutomatically = true)
    @Query("SELECT c FROM CoursesCategory c WHERE  c.disable = :disable")
    List<CoursesCategory> finAdLLByDisable(@Param("disable") boolean disable);
}
