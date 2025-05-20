package com.jobs.visasponsorship.mapper;

import com.jobs.visasponsorship.dto.CreateJobSeekerRequest;
import com.jobs.visasponsorship.dto.JobSeekerDTO;
import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.entity.Role;

public class JobSeekerMapper {

    public static JobSeeker toEntity(CreateJobSeekerRequest request) {
        JobSeeker js = new JobSeeker();
        js.setName(request.getName());
        js.setEmail(request.getEmail());
        js.setPassword(request.getPassword()); // ideally hash it
        js.setRole(Role.JOBSEEKER);
        js.setResumeURL(request.getResumeURL());
        js.setSkills(request.getSkills());
        js.setLocation(request.getLocation());
        js.setVisaStatus(request.getVisaStatus());
        js.setYearsExperience(request.getYearsExperience());
        js.setVerified(false);
        return js;
    }

    public static JobSeekerDTO toDTO(JobSeeker js) {
        JobSeekerDTO dto = new JobSeekerDTO();
        dto.setId(js.getId());
        dto.setName(js.getName());
        dto.setEmail(js.getEmail());
        dto.setResumeURL(js.getResumeURL());
        dto.setSkills(js.getSkills());
        dto.setLocation(js.getLocation());
        dto.setVisaStatus(js.getVisaStatus());
        dto.setYearsExperience(js.getYearsExperience()); // Optional, if applicable
        return dto;
    }

}
