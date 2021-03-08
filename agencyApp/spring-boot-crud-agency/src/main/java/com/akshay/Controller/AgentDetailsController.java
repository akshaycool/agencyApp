package com.akshay.Controller;

import com.akshay.Entity.PocAgentDetails;
import com.akshay.Entity.PocCarrier;
import com.akshay.Service.AgentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgentDetailsController {
    @Autowired
    private AgentDetailsService service;
    @PostMapping("/addAgentDetails")
    public PocAgentDetails addAgentDetails(@RequestBody PocAgentDetails  agentDetails){
        return service.saveAgentDetails( agentDetails);
    }
    @GetMapping("/agentDetails")
    public List<PocAgentDetails> findAllAgentDetails(){
        return service.getAgentDetails();
    }
    @GetMapping("/agentDetailsById/{id}")
    public PocAgentDetails findAgentDetailsById(@PathVariable int id){
        return (PocAgentDetails) service.getAgentDetailsById(id);
    }
    @DeleteMapping("/deleteAgentDetailsById/{id}")
    public String deleteAgentDetails(@PathVariable int id){
        return service.deleteAgentDetails(id);
    }
}
