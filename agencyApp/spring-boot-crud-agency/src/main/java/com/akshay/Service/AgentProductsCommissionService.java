package com.akshay.Service;

import com.akshay.Entity.PocAgentProductsCommission;
import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.AgentProductsCommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentProductsCommissionService {
    @Autowired
    private AgentProductsCommissionRepository repository;
    public PocAgentProductsCommission saveAgentProductsCommission(PocAgentProductsCommission agentProductsCommission){
        return repository.save(agentProductsCommission);
    }
    public List<PocAgentProductsCommission> getAgentProductsCommission(){
        return repository.findAll();
    }
    public Object getAgentProductsCommissionById(int agentProductsCommissionId){
        return repository.findByAgentProductsCommissionId(agentProductsCommissionId);
    }
    public String deleteAgentProductsCommission(int agentProductsCommissionId){
        repository.deleteById(agentProductsCommissionId);
        return "agentProductsCommission Row removed"+agentProductsCommissionId;
    }


}
