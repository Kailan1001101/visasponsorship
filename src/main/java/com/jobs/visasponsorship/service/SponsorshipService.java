package com.jobs.visasponsorship.service;

import com.jobs.visasponsorship.entity.Sponsorship;
import com.jobs.visasponsorship.repo.SponsorshipRepository;

public class SponsorshipService {
    private final SponsorshipRepository sponsorshipRepository;


    public SponsorshipService(SponsorshipRepository sponsorshipRepository) {
        this.sponsorshipRepository = sponsorshipRepository;
    }


}
