package com.example.objectinjection4.model;

public class Employee {

    private String role;
    private Member member;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Employee(String role, Member member) {
        this.role = role;
        this.member = member;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", member=" + member +
                '}';
    }
}
