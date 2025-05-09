package com.jobs.visasponsorship.controller;

import com.jobs.visasponsorship.entity.Employer;
import com.jobs.visasponsorship.service.EmployerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
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
    public void addNewSoftwareEngineer(@RequestBody Employer employer){
        employerService.insertEmployer(employer);
    }

}
