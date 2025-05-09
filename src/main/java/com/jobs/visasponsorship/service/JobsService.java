package com.jobs.visasponsorship.service;

import com.jobs.visasponsorship.entity.Jobs;
import com.jobs.visasponsorship.repo.JobsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsService {

    private final JobsRepository jobsRepository;


    public JobsService(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    public List<Jobs> getAllJobs(){
        return jobsRepository.findAll();
    }

    public void insertJobs(Jobs jobs){
        jobsRepository.save(jobs);
    }
}
