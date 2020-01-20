package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.CouresOuline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouresOulineRepository extends JpaRepository<CouresOuline, Long> {
}
