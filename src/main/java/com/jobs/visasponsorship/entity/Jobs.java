package com.jobs.visasponsorship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String requirements;
    private String location;
    private Boolean sponsorship;
    private String visaTypes;
    private String country;
    private String salaryRange;
    private Date createdAt;
    private Date updatedAt;


    public Jobs(){

    }

    public Jobs(Long id, String title, String description, String requirements, String location, Boolean sponsorship, String visaTypes, String country, String salaryRange, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.location = location;
        this.sponsorship = sponsorship;
        this.visaTypes = visaTypes;
        this.country = country;
        this.salaryRange = salaryRange;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(Boolean sponsorship) {
        this.sponsorship = sponsorship;
    }

    public String getVisaTypes() {
        return visaTypes;
    }

    public void setVisaTypes(String visaTypes) {
        this.visaTypes = visaTypes;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
