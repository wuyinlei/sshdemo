package com.ruolan.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ruolan.domain.Customer;
import com.ruolan.service.CustomerService;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Created by wuyinlei on 2017/9/6.
 * <p>
 * 客户的控制层
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

    //不要忘记手动new
    private Customer mCustomer = new Customer();
    @Override
    public Customer getModel() {
        return mCustomer;
    }

    //提供service的成员属性 提供set方法
    private CustomerService customerService;
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * 保存客户的方法
     *
     * @return
     */
    public String save() {
        System.out.println("WEB层,保存客户...");

//        //web工厂
//        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//        CustomerService customerService = (CustomerService) context.getBean("customerService");
//        customerService.save(mCustomer);

        customerService.save(mCustomer);


        return NONE;
    }


}
