package com.akshay.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="POC_CARRIER")

public class PocCarrier {
    @Id
    @Column(name="CARRIER_ID")
    private int carrierId;
    @Column(name="CARRIER_NAME")
    private String carrierName;



}
