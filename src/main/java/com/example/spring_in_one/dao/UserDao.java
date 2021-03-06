package com.example.spring_in_one.dao;

import com.example.spring_in_one.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
    User findById(String id);
}
