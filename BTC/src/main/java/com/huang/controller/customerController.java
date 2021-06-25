package com.huang.controller;


import com.huang.pojo.Customers;
import com.huang.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Customer")
public class customerController {

    @Autowired
    @Qualifier("customerServiceImpl")
    private CustomerService customerService;

    @RequestMapping("/allCustomer")
    public String list(Model model) {
        List<Customers> list = customerService.queryAllCustomers();
        model.addAttribute("list", list);
        return "allCustomer";
    }


    @RequestMapping("/toAddCustomer")
    public String toAddPaper() {
        return "addCustomer";
    }

    @RequestMapping("/addCustomer")
    public String addPaper(Customers customers) {
        System.out.println(customers);
        customerService.addCustomer(customers);
        return "redirect:/Customer/allCustomer";
    }


    @RequestMapping("/toUpdateCustomer")
    public String toUpdateCustomer(Model model, int id) {
        Customers customers = customerService.queryCustomer(id);
        System.out.println(customers);
        model.addAttribute("customers",customers );
        return "updateCustomer";
    }

    @RequestMapping("/updateCustomer")
    public String updateCustomer(Model model, Customers customer) {
        System.out.println(customer);
        customerService.updataCustomer(customer);
        Customers customers = customerService.queryCustomer(customer.getcID());
        model.addAttribute("Customers", customers);
        return "redirect:/Customer/allCustomer";
    }

    @RequestMapping("/del/{cID}")
    public String deleteBook(@PathVariable("cID") int id) {
        customerService.deleteCustomer(id);
        return "redirect:/Customer/allCustomer";
    }
}