package com.akshay.Repository;

import com.akshay.Entity.PocAgencyProductsCommission;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyProductsCommissionRepository extends JpaRepository<PocAgencyProductsCommission,Integer> {
    PocAgencyProductsCommission findByAgencyProductsCommissionId(Integer agencyProductsCommissionId);
}
