package com.jobs.visasponsorship.mapper;

import com.jobs.visasponsorship.dto.CreateEmployerRequest;
import com.jobs.visasponsorship.dto.EmployerDTO;
import com.jobs.visasponsorship.entity.Employer;
import com.jobs.visasponsorship.entity.Role;

public class EmployerMapper {

    public static Employer toEntity(CreateEmployerRequest request){
        Employer e = new Employer();
        e.setName(request.getName());
        e.setEmail(request.getEmail());
        e.setRole(Role.EMPLOYER);
        e.setCompanyName(request.getCompanyName());
        e.setWebsite(request.getWebsite());
        e.setIndustry(request.getIndustry());
        e.setLocation(request.getLocation());
        e.setVerified(false);
        return e;
    }
    public static EmployerDTO toDTO(Employer e){
        EmployerDTO dto = new EmployerDTO();
        dto.setName(e.getName());
        dto.setEmail(e.getEmail());
        dto.setCompanyName(e.getCompanyName());
        dto.setWebsite(e.getWebsite());
        dto.setIndustry(e.getIndustry());
        dto.setLocation(e.getLocation());

        return dto;
    }
}
