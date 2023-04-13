package com.adrilopmar.projectsAPI.controller.impl;

import com.adrilopmar.projectsAPI.controller.interfaces.ProjectController;
import com.adrilopmar.projectsAPI.dto.ProjectDto;
import com.adrilopmar.projectsAPI.model.Project;
import com.adrilopmar.projectsAPI.repository.ProjectRepository;
import com.adrilopmar.projectsAPI.service.impl.AdminServiceImpl;
import com.adrilopmar.projectsAPI.service.interfaces.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
@CrossOrigin(origins ="http://localhost:3000")
public class ProjectControllerImpl implements ProjectController {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    AdminServiceImpl adminService;
    @Autowired
    ProjectService projectService;
    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Project addProject(@RequestBody @Valid ProjectDto projectDto,Authentication authentication){
        return projectService.addProject(projectDto,authentication);}
    @PatchMapping("/edit/{projectId}")
    @ResponseStatus(HttpStatus.OK)
    public Project editProject(Authentication authentication,@RequestBody @Valid ProjectDto projectDto, @RequestParam Long projectId){
        return projectService.editProject(projectDto,projectId,authentication);
    }
    @DeleteMapping("/delete/{projectId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteProject(Authentication authentication, @RequestParam Long projectId){
        adminService.authentication(authentication);
        projectRepository.deleteById(projectId);
    }
}
