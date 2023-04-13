package com.adrilopmar.projectsAPI.service.interfaces;

import com.adrilopmar.projectsAPI.dto.ProjectDto;
import com.adrilopmar.projectsAPI.model.Project;
import org.springframework.security.core.Authentication;

public interface ProjectService  {
    Project addProject(ProjectDto projectDto, Authentication authentication);

    Project editProject(ProjectDto projectDto, Long projectId,Authentication authentication);
}
