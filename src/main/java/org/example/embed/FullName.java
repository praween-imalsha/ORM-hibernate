package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String fname;
    private String lname;

    public FullName(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public FullName() {
    }
}
