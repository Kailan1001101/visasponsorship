package com.jobs.visasponsorship.service;


import com.jobs.visasponsorship.dto.CreateJobSeekerRequest;
import com.jobs.visasponsorship.dto.JobSeekerDTO;
import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.mapper.JobSeekerMapper;
import com.jobs.visasponsorship.repo.JobSeekerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSeekerService {

    private final JobSeekerRepository jobSeekerRepository;


    public JobSeekerService(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    public JobSeekerDTO createJobSeeker(CreateJobSeekerRequest request) {
        JobSeeker entity = JobSeekerMapper.toEntity(request);
        return JobSeekerMapper.toDTO(jobSeekerRepository.save(entity));
    }

    public Optional<JobSeekerDTO> getById(Long id) {
        return jobSeekerRepository.findById(id)
                .map(JobSeekerMapper::toDTO);
    }

    public List<JobSeeker> getAll() {
        return jobSeekerRepository.findAll();
    }

}
