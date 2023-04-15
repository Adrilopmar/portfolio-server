package com.adrilopmar.projectsAPI.model;


import com.adrilopmar.projectsAPI.classes.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "project_name",columnDefinition = "VARCHAR(50)")),
            @AttributeOverride(name = "url", column = @Column(name = "project_url_name",columnDefinition = "VARCHAR(50)"))
    })
    private Name name;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "longDescription", column = @Column(name = "long_description", columnDefinition = "VARCHAR(2047)")),
            @AttributeOverride(name = "littleDescription", column = @Column(name = "little_description",columnDefinition = "VARCHAR(2047)"))
    })
    private Description description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Backlog> backlog;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Technology> technologies;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "cover", column = @Column(name = "cover_image",columnDefinition = "VARCHAR(1023)")),
            @AttributeOverride(name = "portrait", column = @Column(name = "portrait_image",columnDefinition = "VARCHAR(1023)"))
    })
    private Image images;
    @Column(columnDefinition = "VARCHAR(1023)")
    private String website;

    public Project() {
    }

    public Project(Name name, Description description, List<Backlog> backlog, List<Technology> technologies, Image images) {
        this.name = name;
        this.description = description;
        this.backlog = backlog;
        this.technologies = technologies;
        this.images = images;
    }

    public Project(Name name, Description description, Image images) {
        this.name = name;
        this.description = description;
        this.images = images;
    }

    public Project(Name name, Description description, List<Technology> technologies, Image images) {
        this.name = name;
        this.description = description;
        this.technologies = technologies;
        this.images = images;
    }

    public Project(Name name, Description description, List<Backlog> backlog, List<Technology> technologies, Image images, String website) {
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

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", \nname=" + name +
                ", \ndescription=" + description +
                ", \nbacklog=" + backlog +
                ", \ntechnologies=" + technologies +
                ", \nimages=" + images +
                ", \nwebsite='" + website + '\'' +
                '}';
    }
}
