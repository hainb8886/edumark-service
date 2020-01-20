package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments,Long> {

}
