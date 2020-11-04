package com.example.spring_in_one.service.impl;

import com.example.spring_in_one.dao.CustomerDao;
import com.example.spring_in_one.entity.Customer;
import com.example.spring_in_one.service.CustomerService;
import java.util.Optional;
import javax.persistence.LockModeType;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;

/**
 * Author: zongqi
 * Function:
 * Creating Time：2020/11/4 20:56
 * Version: 1.0.0
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    @Transactional
    public void setCustomerInfo(String uuid, String address, String name) {
        Optional<Customer> customer1 = customerDao.findById(Long.parseLong(uuid));
        //1. 只有执行完加锁语句之后,才是有效的防止被读的锁.也就是说,在这行之下打的断点才能防止有效被读
        /**
         * 深化: 在执行这句语句的过程中,加入了写锁.写锁是排他的.但是不影响读取.因此,上面的查询是正常的.
         * 但是之后.此时继续执行这个语句的时候会发现,此时已经有一个排他锁,因此我无法再给数据库进行上锁了
         */
        Customer customer = customerDao.findByCustomerId(uuid);
        if (address != null) {
            customer.setCustAddress(address);
        }
        if (name != null) {
            customer.setCustName(name);
        }
        customerDao.save(customer);

    }
}
