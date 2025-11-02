package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer>cusList(){
        List<CustomerEntity>customerEntityList = customerRepository.findAll();
        List<Customer> customerList = new ArrayList<>();

        for(CustomerEntity cusEntity : customerEntityList){
            customerList.add(new Customer(
                    cusEntity.getCustomerId(),
                    cusEntity.getName(),
                    cusEntity.getPhoneNumber(),
                    cusEntity.getEmailAddress(),
                    cusEntity.getHomeAddress()
            ));

        }
        return customerList;

    }

}
