package com.jobs.visasponsorship.repo;

import com.jobs.visasponsorship.entity.Sponsorship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorshipRepository extends JpaRepository<Sponsorship,Long> {
}
