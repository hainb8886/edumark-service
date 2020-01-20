package com.edumark.edumarkservice.repository;

import com.edumark.edumarkservice.repository.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
