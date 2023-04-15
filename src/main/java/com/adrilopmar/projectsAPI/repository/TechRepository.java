package com.adrilopmar.projectsAPI.repository;

import com.adrilopmar.projectsAPI.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TechRepository extends JpaRepository<Technology,Long> {
    Optional<Technology> findByName(String name);
}
