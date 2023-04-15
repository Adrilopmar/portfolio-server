package com.adrilopmar.projectsAPI.repository;

import com.adrilopmar.projectsAPI.classes.Name;
import com.adrilopmar.projectsAPI.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    Optional<Project> findByName(Name name);
}
