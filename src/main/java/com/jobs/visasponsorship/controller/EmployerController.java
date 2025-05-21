package com.jobs.visasponsorship.controller;

import com.jobs.visasponsorship.dto.CreateEmployerRequest;
import com.jobs.visasponsorship.dto.EmployerDTO;
import com.jobs.visasponsorship.dto.JobSeekerDTO;
import com.jobs.visasponsorship.entity.Employer;
import com.jobs.visasponsorship.entity.JobSeeker;
import com.jobs.visasponsorship.service.EmployerService;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employer")
public class EmployerController {

    public final EmployerService employerService;

    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping
    public List<Employer> getEmployers(){
        return employerService.getAllEmployers();
    }

    @PostMapping
    public void addEmployer(@RequestBody Employer employer){
        employerService.insertEmployer(employer);
    }

    @PostMapping
    public ResponseEntity<EmployerDTO> addEmployer(@RequestBody CreateEmployerRequest request){
        EmployerDTO saved = employerService.createEmployer(request);
        return ResponseEntity.status(201).body(saved);

    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployerDTO> getEmpolyerById(@PathVariable Long id) {
        Optional<EmployerDTO> result = employerService.getById(id);
        return result.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public List<Employer> getAll() {
        return employerService.getAll();
    }



}
