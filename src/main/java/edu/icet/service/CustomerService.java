package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public void addCustomer(Customer customer){
        customerRepository.save(new CustomerEntity(
            customer.getCustomerId(),
                customer.getName(),
                customer.getPhoneNumber(),
                customer.getEmailAddress(),
                customer.getHomeAddress()
        ));

    }


    public CustomerEntity update(String id, CustomerEntity updateCustom){
        Optional<CustomerEntity>custEntity = customerRepository.findById(id);
        if(custEntity.isPresent()) {
            CustomerEntity customerr =  custEntity.get();
            customerr.setCustomerId(updateCustom.getCustomerId());
            customerr.setName(updateCustom.getName());
            customerr.setPhoneNumber(updateCustom.getPhoneNumber());
            customerr.setEmailAddress(updateCustom.getEmailAddress());
            customerr.setHomeAddress(updateCustom.getHomeAddress());

            return customerRepository.save(customerr);
        }
        return null;


    }
    public boolean customerDeleteById(String id) {
        customerRepository.deleteById(String.valueOf(id));
        return true;
    }

    public Customer customerEntitySearch(String id){
        Optional<CustomerEntity> byId = customerRepository.findById(String.valueOf(id));
        CustomerEntity customerEntity = byId.get();
        return new Customer(
                customerEntity.getCustomerId(),
                customerEntity.getName(),
                customerEntity.getPhoneNumber(),
                customerEntity.getEmailAddress(),
                customerEntity.getHomeAddress()
        );
    }
}
