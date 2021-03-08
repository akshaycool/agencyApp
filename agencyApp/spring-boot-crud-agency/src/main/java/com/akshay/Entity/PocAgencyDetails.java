package com.akshay.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name="POC_AGENCY_DETAILS")
public class PocAgencyDetails {
    @Id
    @Column(name="AGENCY_ID")
    private int agencyId;
    @Column(name="AGENCY_NAME")
    private String agencyName;
    @Column(name="AGENCY_MAIL_ID")
    private String agencyMailId;

}
