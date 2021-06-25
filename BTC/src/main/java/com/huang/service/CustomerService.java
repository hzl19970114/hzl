package com.huang.service;

import com.huang.pojo.Customers;

import java.util.List;

public interface CustomerService {

    int addCustomer(Customers Customer);

    int deleteCustomer(int id);

    int updataCustomer(Customers Customer);

    Customers queryCustomer(int id);

    List<Customers> queryAllCustomers();
}
