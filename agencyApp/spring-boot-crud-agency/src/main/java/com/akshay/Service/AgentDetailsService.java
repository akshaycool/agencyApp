package com.akshay.Service;

import com.akshay.Entity.PocAgentDetails;
import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.AgentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentDetailsService {
    @Autowired
    private AgentDetailsRepository repository;
    public PocAgentDetails saveAgentDetails(PocAgentDetails agentDetails){
        return repository.save(agentDetails);
    }
    public List<PocAgentDetails> getAgentDetails(){
        return repository.findAll();
    }
    public Object getAgentDetailsById(int agentId){
        return repository.findByAgentId(agentId);
    }
    public String deleteAgentDetails(int agentId){
        repository.deleteById(agentId);
        return "carrier removed"+agentId;
    }

}
