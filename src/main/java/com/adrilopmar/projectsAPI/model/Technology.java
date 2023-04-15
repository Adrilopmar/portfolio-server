package com.adrilopmar.projectsAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long techId;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    @JsonIgnore
    private List<Project> projectId;
    private String name;
    private String logo;

    public Technology() {
    }

    public Technology(String name) {
        this.name = name;
    }

    public Technology(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public Long getTechId() {
        return techId;
    }

    public List<Project> getProjectId() {
        return projectId;
    }

    public void setProjectId(List<Project> projectId) {
        this.projectId = projectId;
    }

    public Long getId() {
        return techId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
