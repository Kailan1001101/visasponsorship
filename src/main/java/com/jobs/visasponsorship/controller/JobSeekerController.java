package com.jobs.visasponsorship.controller;


import com.jobs.visasponsorship.dto.CreateJobSeekerRequest;
import com.jobs.visasponsorship.dto.JobSeekerDTO;
import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.repo.JobSeekerRepository;
import com.jobs.visasponsorship.service.JobSeekerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {

    private final JobSeekerService jobSeekerService;


    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }
    /**
     * Create a new Job Seeker account
     */
    @PostMapping
    public ResponseEntity<JobSeekerDTO> createJobSeeker(@RequestBody CreateJobSeekerRequest request) {
        JobSeekerDTO saved = jobSeekerService.createJobSeeker(request);
        return ResponseEntity.status(201).body(saved);
    }

    /**
     * Get a Job Seeker by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<JobSeekerDTO> getJobSeekerById(@PathVariable Long id) {
        Optional<JobSeekerDTO> result = jobSeekerService.getById(id);
        return result.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public List<JobSeeker> getAll() {
        return jobSeekerService.getAll();
    }


    /**
     * Example: Update profile (Optional feature)
     */
    // @PutMapping("/{id}")
    // public ResponseEntity<JobSeekerDTO> updateJobSeeker(
    //         @PathVariable Long id,
    //         @RequestBody UpdateJobSeekerRequest updateRequest
    // ) {
    //     JobSeekerDTO updated = jobSeekerService.updateJobSeeker(id, updateRequest);
    //     return ResponseEntity.ok(updated);
    // }
}
