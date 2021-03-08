package com.akshay.Controller;

import com.akshay.Entity.PocAgencyProductsCommission;
import com.akshay.Entity.PocCarrier;
import com.akshay.Service.AgencyProductsCommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgencyProductsCommissionController {
    @Autowired
    private AgencyProductsCommissionService service;
    @PostMapping("/addAgencyProductsCommission")
    public PocAgencyProductsCommission addAgencyProductsCommission(@RequestBody PocAgencyProductsCommission agencyProductsCommission ){
        return service.saveAgencyProductsCommission(agencyProductsCommission);
    }
    @GetMapping("/agencyProductsCommission")
    public List<PocAgencyProductsCommission> findAllAgencyProductsCommission(){
        return service.getAgencyProductsCommission();
    }
    @GetMapping("/agencyProductsCommissionById/{id}")
    public PocAgencyProductsCommission findAgencyProductsCommissionById(@PathVariable int id){
        return (PocAgencyProductsCommission) service.getAgencyProductsCommissionById(id);
    }
    @DeleteMapping("/deleteAgencyProductsCommission/{id}")
    public String deleteAgencyProductsCommission(@PathVariable int id){
        return service.deleteAgencyProductsCommissionId(id);
    }
}
