package com.qpAssesment.qpAssesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qpAssesment.qpAssesment.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
