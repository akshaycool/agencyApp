package com.akshay.Repository;

import com.akshay.Entity.PocAgentDetails;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentDetailsRepository extends JpaRepository<PocAgentDetails,Integer> {
    PocAgentDetails findByAgentId(Integer agentId);
}
