package org.shequal.jobportal.controller;

import java.util.List;
import org.shequal.jobportal.models.Job;
import org.shequal.jobportal.service.JobService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JobController {

    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World ";
    }

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return service.getAllJobs();
    }
}