package com.adrilopmar.projectsAPI.model;


import com.adrilopmar.projectsAPI.classes.Description;
import com.adrilopmar.projectsAPI.classes.Image;
import com.adrilopmar.projectsAPI.classes.Step;
import com.adrilopmar.projectsAPI.classes.Tech;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Description description;
    @Embedded
    private List<Step> backlog;
    @Embedded
    private List<Tech> technologies;
    @Embedded
    private Image images;
    private String website;

    public Project() {
    }
    public Project(Description description, List<Step> backlog, List<Tech> technologies, Image images) {
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
    }

    public Project(Description description, List<Step> backlog, List<Tech> technologies, Image images, String website) {
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
        this.website = website;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
