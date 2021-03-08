package com.akshay.Repository;

import com.akshay.Entity.PocAgencyDetails;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyDetailsRepository extends JpaRepository<PocAgencyDetails,Integer> {
    PocAgencyDetails findByAgencyId(Integer agencyId);
}
