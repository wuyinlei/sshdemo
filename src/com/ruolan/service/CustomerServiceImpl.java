package com.ruolan.service;

import com.ruolan.dao.CustomerDao;
import com.ruolan.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wuyinlei on 2017/9/6.
 */
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("业务层保存用户...");
        customerDao.save(customer);
    }
}
