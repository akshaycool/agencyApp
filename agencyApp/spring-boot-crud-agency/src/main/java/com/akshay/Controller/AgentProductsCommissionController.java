package com.akshay.Controller;

import com.akshay.Entity.PocAgentProductsCommission;
import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.AgentProductsCommissionRepository;
import com.akshay.Service.AgentProductsCommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentProductsCommissionController {
    @Autowired
    private AgentProductsCommissionService service;

    @PostMapping("/addAgentProductsCommission")
    public PocAgentProductsCommission addAgentProductsCommission(@RequestBody PocAgentProductsCommission agentProductsCommission ){
        return service.saveAgentProductsCommission(agentProductsCommission);
    }
    @GetMapping("/agentProductsCommission")
    public List<PocAgentProductsCommission> findAllAgentProductsCommission(){
        return service.getAgentProductsCommission();
    }
    @GetMapping("/agentProductsCommissionById/{id}")
    public PocAgentProductsCommission findAgentProductsCommissionById(@PathVariable int id){
        return (PocAgentProductsCommission) service.getAgentProductsCommissionById(id);
    }
    @DeleteMapping("/deleteAgentProductsCommission/{id}")
    public String deleteAgentProductsCommission(@PathVariable int id){
        return service.deleteAgentProductsCommission(id);
    }
}
