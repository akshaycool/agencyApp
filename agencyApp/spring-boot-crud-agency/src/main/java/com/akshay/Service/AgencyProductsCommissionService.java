package com.akshay.Service;

import com.akshay.Entity.PocAgencyProductsCommission;
import com.akshay.Entity.PocCarrier;
import com.akshay.Repository.AgencyProductsCommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
public class AgencyProductsCommissionService {
    @Autowired
    private AgencyProductsCommissionRepository repository;
    public PocAgencyProductsCommission saveAgencyProductsCommission(PocAgencyProductsCommission agencyProductsCommission){
        return repository.save(agencyProductsCommission);
    }
    public List<PocAgencyProductsCommission> getAgencyProductsCommission(){
        return repository.findAll();
    }
    public Object getAgencyProductsCommissionById(int agencyProductsCommissionId){
        return repository.findByAgencyProductsCommissionId(agencyProductsCommissionId);
    }
    public String deleteAgencyProductsCommissionId(int agencyProductsCommissionId){
        repository.deleteById(agencyProductsCommissionId);
        return " deleted agencyProductsCommissionId"+agencyProductsCommissionId;
    }
}
