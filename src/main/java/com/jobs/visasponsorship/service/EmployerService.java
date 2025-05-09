package com.jobs.visasponsorship.service;

import com.jobs.visasponsorship.entity.Employer;
import com.jobs.visasponsorship.repo.EmployerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {

    private final EmployerRepository employerRepository;


    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;


    }

    public List<Employer> getAllEmployers(){
        return employerRepository.findAll();
    }

    public void insertEmployer(Employer employer) {
        employerRepository.save(employer);
    }

}


