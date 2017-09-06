package com.ruolan.dao;

import apple.laf.JRSUIConstants;
import com.ruolan.domain.Customer;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by wuyinlei on 2017/9/6.
 * <p>
 * 持久层  保存用户
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {


    @Override
    public void save(Customer customer) {
        System.out.println("持久层保存用户...");

        //把数据保存到数据库中
       this.getHibernateTemplate().save(customer);
    }
}
