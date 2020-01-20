package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Long> {

}
