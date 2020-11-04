package com.example.spring_in_one.service.impl;

import com.example.spring_in_one.dao.CustomerDao;
import com.example.spring_in_one.entity.Customer;
import com.example.spring_in_one.service.CustomerService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    //@Lock()
    @Override
    @Transactional
    public void setCustomerInfo(String uuid, String address,String name){
        //1. 只有执行完加锁语句之后,才是有效的防止被读的锁.也就是说,在这行之下打的断点才能防止有效被读
        Customer customer = customerDao.findByCustomerId(uuid);
        customer.setCustAddress(address);
        customer.setCustName(name);
        customerDao.save(customer);
    }
}
