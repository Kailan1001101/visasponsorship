package com.jobs.visasponsorship.service;


import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.repo.JobSeekerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService {

    private final JobSeekerRepository jobSeekerRepository;


    public JobSeekerService(JobSeekerRepository jobSeekerRepository) {
        this.jobSeekerRepository = jobSeekerRepository;
    }

    public List<JobSeeker> getAllJobSeekers(){
        return jobSeekerRepository.findAll();
    }

    public void insertSeeker(JobSeeker jobSeeker){
        jobSeekerRepository.save(jobSeeker);
    }

}
