package com.edumark.edumarkservice.repository;


import com.edumark.edumarkservice.repository.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionsRepository extends JpaRepository<Regions,Integer> {

}
