package com.akshay.Controller;

import com.akshay.Entity.PocCarrier;
import com.akshay.Entity.PocPolicyHolder;
import com.akshay.Repository.PolicyHolderRepository;
import com.akshay.Service.PolicyHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolicyHolderController {
    @Autowired
    private PolicyHolderService service;

    @PostMapping("/addPolicyHolder")
    public PocPolicyHolder addPolicyHolder(@RequestBody PocPolicyHolder policyHolder ){
        return service.savePolicyHolder(policyHolder);
    }
    @GetMapping("/policyHolder")
    public List<PocPolicyHolder> findAllPolicyHolder(){
        return service.getPolicyHolder();
    }
    @GetMapping("/policyHolderById/{id}")
    public PocPolicyHolder findPolicyHolderById(@PathVariable int id){
        return (PocPolicyHolder) service.getPolicyHolderById(id);
    }
    @DeleteMapping("/deletePolicyHolder/{id}")
    public String deletePolicyHolder(@PathVariable int id){
        return service.deletePolicyHolder(id);
    }
}
