package com.adrilopmar.projectsAPI.classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Tech {
    private String name;
    private String logo;

    public Tech() {
    }

    public Tech(String name, String logo) {
        this.name = name;
        this.logo = logo;
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
