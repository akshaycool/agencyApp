package com.akshay.Service;

import com.akshay.Entity.PocAgencyDetails;
import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.AgencyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyDetailsService {
    @Autowired
    private AgencyDetailsRepository repository;
    public PocAgencyDetails saveAgencyDetails(PocAgencyDetails agencyDetails){
        return repository.save(agencyDetails);
    }
    public List<PocAgencyDetails> getAgencyDetails(){
        return repository.findAll();
    }
    public Object getAgencyDetailsById(int agencyId){
        return repository.findByAgencyId(agencyId);
    }
    public String deleteAgencyDetailsById(int agencyId){
        repository.deleteById(agencyId);
        return "AgencyDetails Row removed"+agencyId;
    }

}
