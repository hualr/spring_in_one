package com.example.spring_in_one.service.impl.internal.impl;

import com.example.spring_in_one.dao.CustomerDao;
import com.example.spring_in_one.entity.Customer;
import com.example.spring_in_one.service.impl.internal.api.InernalService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zongqi
 * Function:
 * Creating Time：2020/11/5 10:10
 * Version: 1.0.0
 */
//新事务 排他锁 最终导致出现死锁情况
@Transactional()
@Service
public class InernalServiceImpl implements InernalService {
    @Autowired
    CustomerDao customerDao;

    @Override
    public void saveInfo(String uuid, String phone) {
        Customer customerId = customerDao.findByCustomerId(uuid);
        customerId.setCustPhone(phone);
        customerDao.save(customerId);
    }

    @Override
    public void saveInfo(Customer customer, String phone) {
        customer.setCustPhone(phone);
        customerDao.save(customer);
    }
}
