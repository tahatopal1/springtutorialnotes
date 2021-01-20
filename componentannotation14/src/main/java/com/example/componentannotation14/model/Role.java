package com.example.componentannotation14.model;

public class Role {
    private String workingRole;

    public Role() { }

    public Role(String workingRole) {
        this.workingRole = workingRole;
    }

    public String getWorkingRole() {
        return workingRole;
    }

    public void setWorkingRole(String workingRole) {
        this.workingRole = workingRole;
    }

    @Override
    public String toString() {
        return "Role{" +
                "workingRole='" + workingRole + '\'' +
                '}';
    }
}
