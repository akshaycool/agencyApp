package com.akshay.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="POC_AGENCY_PRODUCT")
public class PocAgencyProduct {
    @Id
    @Column(name="AGENCY_PRODUCT_ID")
    private int agencyProductId;
    @Column(name="AGENCY_ID")
    private int agencyId;
    @ManyToOne
    @JoinColumn(name="PRODUCT_ID")
    private PocProductsCarrier productsCarrier;

}
