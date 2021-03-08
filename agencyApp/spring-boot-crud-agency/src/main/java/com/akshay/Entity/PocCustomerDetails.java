package com.akshay.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="POC_CUSTOMER_DETAILS")

public class PocCustomerDetails {
    @Id

    @Column(name="CUSTOMER_ID")
    private int customerId;

    @Column(name="CUSTOMER_NAME")
    private String customerName;
    @Column(name="MOBILE_NUMBER")
    private long mobileNumber;

}
