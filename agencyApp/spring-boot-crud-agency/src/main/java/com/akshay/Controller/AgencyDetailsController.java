package com.akshay.Controller;

import com.akshay.Entity.PocAgencyDetails;
import com.akshay.Entity.PocCarrier;
import com.akshay.Service.AgencyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgencyDetailsController {
     @Autowired
    private AgencyDetailsService service;

    @PostMapping("/addAgencyDetails")
    public PocAgencyDetails addAgencyDetails(@RequestBody PocAgencyDetails agencyDetails ){
        return service.saveAgencyDetails(agencyDetails);
    }
    @GetMapping("/agencyDetails")
    public List<PocAgencyDetails> findAllAgencyDetails(){
        return service.getAgencyDetails();
    }
    @GetMapping("/agencyDetailsById/{id}")
    public PocAgencyDetails findAgencyDetailsById(@PathVariable int id){
        return (PocAgencyDetails) service.getAgencyDetailsById(id);
    }
    @DeleteMapping("/deleteAgencyDetailsById/{id}")
    public String deleteAgencyDetailsById(@PathVariable int id){
        return service.deleteAgencyDetailsById(id);
    }
}
