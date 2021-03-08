package com.akshay.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POC_AGENT_DETAILS")
@Data
public class PocAgentDetails {
    @Id
    @Column(name="AGENT_ID")
    private int agentId;
    @Column(name="AGENT_NAME")
    private String agentName;
    @Column(name="AGENT_MAIL_ID")
    private String agentMailId;
    @Column(name="AGENCY_ID")
    private int agencyId;
}
