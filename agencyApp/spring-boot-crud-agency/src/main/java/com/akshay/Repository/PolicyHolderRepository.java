package com.akshay.Repository;

import com.akshay.Entity.PocPolicyHolder;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyHolderRepository extends JpaRepository<PocPolicyHolder,Integer> {
    PocPolicyHolder findByPolicyId(Integer policyHolderId);
}
