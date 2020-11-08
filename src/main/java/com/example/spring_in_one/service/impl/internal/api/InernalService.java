package com.example.spring_in_one.service.impl.internal.api;

import com.example.spring_in_one.dao.CustomerDao;
import com.example.spring_in_one.entity.Customer;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zongqi
 * Function:
 * Creating Time：2020/11/5 10:10
 * Version: 1.0.0
 */
public interface InernalService {

    void saveInfo(String uuid, String phone);
    void saveInfo(Customer customer, String phone);
}
