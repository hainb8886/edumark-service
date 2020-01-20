package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Countries,Integer> {
}
