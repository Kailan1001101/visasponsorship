package com.jobs.visasponsorship.controller;

import com.jobs.visasponsorship.entity.Employer;
import com.jobs.visasponsorship.service.EmployerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
