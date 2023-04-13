package com.adrilopmar.projectsAPI.dto;

import com.adrilopmar.projectsAPI.classes.Description;
import com.adrilopmar.projectsAPI.classes.Image;
import com.adrilopmar.projectsAPI.classes.Step;
import com.adrilopmar.projectsAPI.classes.Tech;

import java.util.List;

public class ProjectDto {

    private Description description;
    private List<Step> backlog;
    private List<Tech> technologies;
    private Image images;
    private String website;

    public ProjectDto() {
    }
    public ProjectDto(Description description, List<Step> backlog, List<Tech> technologies, Image images) {
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
    }
    public ProjectDto(Description description, List<Step> backlog, List<Tech> technologies, Image images, String website) {
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
        this.website = website;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<Step> getBacklog() {
        return backlog;
    }

    public void setBacklog(List<Step> backlog) {
        this.backlog = backlog;
    }

    public List<Tech> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Tech> technologies) {
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
