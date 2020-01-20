package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.CoursesRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRatesRepository extends JpaRepository<CoursesRates, Long> {

}
