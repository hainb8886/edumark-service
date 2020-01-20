package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<Cities, Integer> {
}
