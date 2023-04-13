package com.adrilopmar.projectsAPI.classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    private String fullName;
    private String shortName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
