package com.jobs.visasponsorship.controller;

import com.jobs.visasponsorship.entity.Jobs;
import com.jobs.visasponsorship.service.JobsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobsController {

    private final JobsService jobsService;

    public JobsController(JobsService jobsService) {
        this.jobsService = jobsService;
    }

    @GetMapping
    private List<Jobs> getJobs(){
        return jobsService.getAllJobs();
    }

    @PostMapping
    private void getJobs(@RequestBody Jobs jobs){
       jobsService.insertJobs(jobs);
    }
}
