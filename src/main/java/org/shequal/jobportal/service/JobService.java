package org.shequal.jobportal.service;

import java.util.List;
import org.shequal.jobportal.models.Job;
import org.shequal.jobportal.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    private final JobRepository repository;

    public JobService(JobRepository repository) {
        this.repository = repository;
    }

    public List<Job> getAllJobs() {
        return repository.findAll();
    }
}
