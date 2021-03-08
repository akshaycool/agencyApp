package com.akshay.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="POC_POLICY_HOLDER")
public class PocPolicyHolder {
    @Id
    @Column(name="POLICY_ID")
    private int policyId;
    @ManyToOne

    @JoinColumn(name="PRODUCT_ID")
    private PocProductsCarrier productsCarrier;
    @ManyToOne
    @JoinColumn(name="AGENT_ID")
    private PocAgentDetails agentDetails;
    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID")
    private PocCustomerDetails customerDetails;
}
