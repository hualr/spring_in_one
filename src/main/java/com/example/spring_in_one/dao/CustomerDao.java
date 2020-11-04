package com.example.spring_in_one.dao;

import com.example.spring_in_one.entity.Customer;
import javax.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query(value = "FROM Customer where  cust_id= :cust_id")
    Customer findByCustomerId(@Param("cust_id") String cust_id);
}
