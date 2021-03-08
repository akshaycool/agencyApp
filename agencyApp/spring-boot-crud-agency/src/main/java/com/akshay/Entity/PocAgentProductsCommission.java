package com.akshay.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="POC_AGENT_PRODUCTS_COMMISSION")
public class PocAgentProductsCommission {
    @Id
    @Column(name="AGENT_PRODUCTS_COMMISSION_ID")
    private int agentProductsCommissionId;
    @ManyToOne
    @JoinColumn(name="AGENT_ID")
    private PocAgentDetails agentDetails;
    @ManyToOne
    @JoinColumn (name="PRODUCT_ID")
    private PocProductsCarrier productsCarrier;
    @Column(name="COMMISSION_AMOUNT")
    private double commissionAmount;

}
