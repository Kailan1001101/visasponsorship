package com.jobs.visasponsorship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String website;
    private String industry;
    private String location;

    public Employer(){

    }

    public Employer(Long id, String companyName, String website, String industry, String location, Boolean verified, Date firstDate) {
        this.id = id;
        this.companyName = companyName;
        this.website = website;
        this.industry = industry;
        this.location = location;
        this.verified = verified;
        this.firstDate = firstDate;
    }

    private Boolean verified;
    private Date firstDate;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Date getFirstDate() {
        return firstDate;
    }





    
}
