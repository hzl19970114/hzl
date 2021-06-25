package com.huang.service;

import com.huang.dao.CustomersMapper;
import com.huang.pojo.Customers;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomersMapper customersMapper;

    public void setCustomersMapper(CustomersMapper customersMapper) {
        this.customersMapper = customersMapper;
    }

    public int addCustomer(Customers Customer) {
        return customersMapper.addCustomer(Customer);
    }

    public int deleteCustomer(int id) {
        return customersMapper.deleteCustomersById(id);
    }

    public int updataCustomer(Customers Customer) {
        return customersMapper.updateCustomers(Customer);
    }

    public Customers queryCustomer(int id) {
        return customersMapper.queryCustomer(id);
    }

    public List<Customers> queryAllCustomers() {
        return customersMapper.queryAllCustomers();
    }
}
