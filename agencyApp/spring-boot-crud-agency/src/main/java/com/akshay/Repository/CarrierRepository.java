package com.akshay.Repository;

import com.akshay.Entity.PocCarrier;
import com.akshay.Entity.PocProductsCarrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrierRepository extends JpaRepository<PocCarrier,Integer> {
    PocCarrier findByCarrierId(Integer carrierId);


}
