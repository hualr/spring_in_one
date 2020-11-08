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

   // @Lock(LockModeType.PESSIMISTIC_WRITE)
    //@Query(value = "FROM Customer where  cust_id= :cust_id")


    @Query(value = "select * from cst_customer where cust_id=?1 for update",nativeQuery = true)
    Customer findByCustomerId(@Param("cust_id") String cust_id);
}


/*
@Query(value = "SELECT * FROM t_article WHERE index_state=0",nativeQuery = true)
public List<Article> getArticleNoIndex();

*/
/**
 * 更改索引为true
 *//*

@Transactional
@Modifying
@Query(value = "UPDATE t_article SET index_state = TRUE  WHERE id =?1",nativeQuery = true)
public void updateArticleIndex(Integer id);
*/
