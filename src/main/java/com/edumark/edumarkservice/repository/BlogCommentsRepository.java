package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.BlogComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogCommentsRepository  extends JpaRepository<BlogComments, Long> {

}
