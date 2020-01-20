package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Long> {

}
