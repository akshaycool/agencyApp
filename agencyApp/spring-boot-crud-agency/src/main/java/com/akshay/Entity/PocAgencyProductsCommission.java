package com.akshay.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="POC_AGENCY_PRODUCTS_COMMISSION")
public class PocAgencyProductsCommission {
@Id
@Column(name="AGENCY_PRODUCTS_COMMISSION_ID")
    private int agencyProductsCommissionId;
@ManyToOne
 @JoinColumn(name="AGENCY_ID")
    private PocAgencyDetails agencyDetails;
@ManyToOne
     @JoinColumn(name="PRODUCT_ID")
     private PocProductsCarrier productsCarrier;
     @Column(name="COMMISSION_AMOUNT")
     private double commissionAmount;
}
