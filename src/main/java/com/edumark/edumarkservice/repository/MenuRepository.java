package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {

}
