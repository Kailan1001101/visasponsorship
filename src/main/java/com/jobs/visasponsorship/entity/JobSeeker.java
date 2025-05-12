package com.jobs.visasponsorship.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobSeekerId;
    private String fullName;
    private String resumeURL;
    private String yearsExperience;
    private String[] skills;
    private String location;
    private String visaStatus;
    private Date createdAt;

    public JobSeeker(){

    }

    public JobSeeker(Long jobSeekerId, String fullName, String resumeURL, String yearsExperience, String[] skills, String location, String visaStatus, Date createdAt) {
        jobSeekerId = jobSeekerId;
        this.fullName = fullName;
        this.resumeURL = resumeURL;
        this.yearsExperience = yearsExperience;
        this.skills = skills;
        this.location = location;
        this.visaStatus = visaStatus;
        this.createdAt = createdAt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getResumeURL() {
        return resumeURL;
    }

    public void setResumeURL(String resumeURL) {
        this.resumeURL = resumeURL;
    }

    public String getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(String yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
