package com.akshay.Service;

import com.akshay.Entity.PocCarrier;
import com.akshay.Entity.PocCustomerDetails;
import com.akshay.Repository.CustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDetailsService {
    @Autowired
    private CustomerDetailsRepository repository;
    public PocCustomerDetails saveCustomerDetails(PocCustomerDetails customerDetails){
        return repository.save(customerDetails);
    }
    public List<PocCustomerDetails> getCustomerDetails(){
        return repository.findAll();
    }
    public Object getCustomerDetailsById(int customerId){
        return repository.findByCustomerId(customerId);
    }
    public String deleteCustomerDetails(int customerId){
        repository.deleteById(customerId);
        return "CustomerDetails removed"+customerId;
    }

}
