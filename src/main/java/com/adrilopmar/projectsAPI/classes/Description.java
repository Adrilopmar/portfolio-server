package com.adrilopmar.projectsAPI.classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Description {
    private String longDescription;
    private String littleDescription;

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getLittleDescription() {
        return littleDescription;
    }

    public void setLittleDescription(String littleDescription) {
        this.littleDescription = littleDescription;
    }
}
