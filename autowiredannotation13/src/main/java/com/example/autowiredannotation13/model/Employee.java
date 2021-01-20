package com.example.autowiredannotation13.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    @Autowired
    private Member member;
    private String role;

    public Employee() { }

    public Employee(Member member, String role) {
        this.member = member;
        this.role = role;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Member getMember() {
        return member;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "member=" + member +
                ", role='" + role + '\'' +
                '}';
    }
}
