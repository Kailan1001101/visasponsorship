package com.jobs.visasponsorship.controller;


import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.repo.JobSeekerRepository;
import com.jobs.visasponsorship.service.JobSeekerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {

    private final JobSeekerService jobSeekerService;


    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping
    public List<JobSeeker> getJobSeekers(){
        return jobSeekerService.getAllJobSeekers();
    }
    @PostMapping
    public void insertJobSeekers(@RequestBody JobSeeker jobSeeker){
        jobSeekerService.insertSeeker(jobSeeker);
    }
}
