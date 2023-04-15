package com.adrilopmar.projectsAPI.dto;

import com.adrilopmar.projectsAPI.classes.*;
import com.adrilopmar.projectsAPI.model.Backlog;
import com.adrilopmar.projectsAPI.model.Technology;

import java.util.List;

public class ProjectDto {
    private Name name;
    private Description description;
    private List<Backlog> backlog;
    private List<Technology> technologies;
    private Image images;
    private String website;

    public ProjectDto() {
    }
    public ProjectDto(Name name, Description description, List<Backlog> backlog, List<Technology> technologies, Image images) {
        this.name = name;
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
    }
    public ProjectDto(Name name, Description description, List<Backlog> backlog, List<Technology> technologies, Image images, String website) {
        this.name = name;
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
        this.website = website;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<Backlog> getBacklog() {
        return backlog;
    }

    public void setBacklog(List<Backlog> backlog) {
        this.backlog = backlog;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
