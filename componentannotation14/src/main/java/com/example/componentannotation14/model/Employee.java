package com.example.componentannotation14.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private Member member;

    @Autowired
    private Role   role;

    public Employee() { }

    public Employee(Member member, Role role) {
        this.member = member;
        this.role = role;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "member=" + member +
                ", role=" + role +
                '}';
    }
}
