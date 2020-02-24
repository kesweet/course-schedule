package com.katherinesweet.courseschedule.models;

public enum DepartmentJob {

    SOLEINSTRUCTOR("Sole Instructor"),
    TEACHINGASSISTANT("Teaching Assistant"),
    RESEARCHASSISTANT("Research Assistant"),
    POSTDOCRESEARCHER("Post-doc Researcher"),
    GRANTWORKER("Grant Worker");


    private final String displayName;

    DepartmentJob(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
