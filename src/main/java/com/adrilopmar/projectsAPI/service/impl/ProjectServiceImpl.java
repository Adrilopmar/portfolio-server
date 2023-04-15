package com.adrilopmar.projectsAPI.service.impl;

import com.adrilopmar.projectsAPI.dto.ProjectDto;
import com.adrilopmar.projectsAPI.model.Project;
import com.adrilopmar.projectsAPI.model.Technology;
import com.adrilopmar.projectsAPI.repository.ProjectRepository;
import com.adrilopmar.projectsAPI.repository.TechRepository;
import com.adrilopmar.projectsAPI.service.interfaces.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    AdminServiceImpl adminService;

    @Override
    public Project addProject(ProjectDto dto, Authentication authentication) {
        adminService.authentication(authentication);
        Optional<Project> optionalProject = projectRepository.findByName(dto.getName());
        if(optionalProject.isPresent())  throw new ResponseStatusException(HttpStatus.FORBIDDEN,"Project already exists");
        Project newProject = new Project(
                dto.getName(),
                dto.getDescription(),
                dto.getImages()
        );
        List<Technology> techList = new ArrayList<>(dto.getTechnologies());
        newProject.setBacklog(dto.getBacklog());
        newProject.setTechnologies(techList);
        if (dto.getImages() != null) newProject.setImages(dto.getImages());
        if(dto.getWebsite() !=null) newProject.setWebsite(dto.getWebsite());
        projectRepository.save(newProject);
        return newProject;
    }
    public Project editProject(ProjectDto dto, Long projectId,Authentication authentication) {
        adminService.authentication(authentication);
        Optional<Project> optionalProject = projectRepository.findById(projectId);
        if(!optionalProject.isPresent()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        if (dto.getDescription() != null) optionalProject.get().setDescription(dto.getDescription());
        if (dto.getBacklog() != null) optionalProject.get().setBacklog(dto.getBacklog());
        if (dto.getTechnologies() != null) optionalProject.get().setTechnologies(dto.getTechnologies());
        if (dto.getImages() != null) optionalProject.get().setImages(dto.getImages());
        if (dto.getWebsite() != null) optionalProject.get().setWebsite(dto.getWebsite());
        projectRepository.save(optionalProject.get());
        return optionalProject.get();
    }
}
