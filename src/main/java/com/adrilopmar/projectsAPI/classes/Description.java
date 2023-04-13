package com.adrilopmar.projectsAPI.classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Description {
    private String full;
    private String little;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getLittle() {
        return little;
    }

    public void setLittle(String little) {
        this.little = little;
    }
}
