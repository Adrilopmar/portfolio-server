package com.adrilopmar.projectsAPI.repository;

import com.adrilopmar.projectsAPI.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

}
