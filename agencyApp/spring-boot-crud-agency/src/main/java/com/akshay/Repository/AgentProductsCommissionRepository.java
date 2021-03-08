package com.akshay.Repository;

import com.akshay.Entity.PocAgentProductsCommission;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentProductsCommissionRepository extends JpaRepository<PocAgentProductsCommission,Integer> {
    PocAgentProductsCommission findByAgentProductsCommissionId(Integer agentProductsCommissionId);
}
