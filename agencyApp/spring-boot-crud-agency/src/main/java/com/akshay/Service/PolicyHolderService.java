package com.akshay.Service;

import com.akshay.Entity.PocCarrier;
import com.akshay.Entity.PocPolicyHolder;
import com.akshay.Repository.PolicyHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyHolderService {
    @Autowired
    private PolicyHolderRepository repository;

    public PocPolicyHolder savePolicyHolder(PocPolicyHolder policyHolder){
        return repository.save(policyHolder);
    }
    public List<PocPolicyHolder> getPolicyHolder(){
        return repository.findAll();
    }
    public Object getPolicyHolderById(int policyId){
        return repository.findByPolicyId(policyId);
    }
    public String deletePolicyHolder(int policyId){
        repository.deleteById(policyId);
        return "policyHolder removed"+policyId;
    }

}
