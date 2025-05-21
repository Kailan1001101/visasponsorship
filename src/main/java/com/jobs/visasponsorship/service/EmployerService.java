package com.jobs.visasponsorship.service;

import com.jobs.visasponsorship.dto.CreateEmployerRequest;
import com.jobs.visasponsorship.dto.EmployerDTO;
import com.jobs.visasponsorship.entity.Employer;
import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.mapper.EmployerMapper;
import com.jobs.visasponsorship.repo.EmployerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public EmployerDTO createEmployer(CreateEmployerRequest request) {
        Employer entity = EmployerMapper.toEntity(request);
        return EmployerMapper.toDTO(employerRepository.save(entity));
    }

    public Optional<EmployerDTO> getById(Long id){
        return employerRepository.findById(id).map(EmployerMapper::toDTO);

    }

    public List<Employer> getAll() {
        return employerRepository.findAll();
    }



}


