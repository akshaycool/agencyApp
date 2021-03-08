package com.akshay.Controller;

import com.akshay.Entity.PocCarrier;
import com.akshay.Entity.PocCustomerDetails;
import com.akshay.Service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerDetailsController {
    @Autowired
    private CustomerDetailsService service;
    @PostMapping("/addCustomerDetails")
    public PocCustomerDetails addCarrier(@RequestBody PocCustomerDetails customerDetails ){
        return service.saveCustomerDetails(customerDetails);
    }
    @GetMapping("/customerDetails")
    public List<PocCustomerDetails> findAllCustomerDetails(){
        return service.getCustomerDetails();
    }
    @GetMapping("/customerDetailsById/{id}")
    public PocCustomerDetails findCustomerDetailsById(@PathVariable int id){
        return (PocCustomerDetails) service.getCustomerDetailsById(id);
    }
    @DeleteMapping("/deleteCustomerDetails/{c_id}")
    public String deleteCustomerDetails(@PathVariable int id){
        return service.deleteCustomerDetails(id);
    }
}
