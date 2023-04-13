package com.adrilopmar.projectsAPI.controller.interfaces;

import com.adrilopmar.projectsAPI.dto.ProjectDto;
import com.adrilopmar.projectsAPI.model.Project;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface ProjectController {
    List<Project> getAllProjects();
    Project addProject(ProjectDto projectDto,Authentication authentication);
}
