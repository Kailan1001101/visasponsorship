package com.jobs.visasponsorship.repo;


import com.jobs.visasponsorship.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,Long> {

}
