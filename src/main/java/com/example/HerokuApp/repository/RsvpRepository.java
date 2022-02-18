package com.example.HerokuApp.repository;

import com.example.HerokuApp.models.Rsvp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RsvpRepository extends JpaRepository<Rsvp, Integer> {
}