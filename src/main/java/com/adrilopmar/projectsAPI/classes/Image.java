package com.adrilopmar.projectsAPI.classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Image {
    private String cover;
    private String portrait;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
}
