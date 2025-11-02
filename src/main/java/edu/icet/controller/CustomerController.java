package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getAll")
    public List<Customer> customers(){
        return customerService.cusList();

    }
}
