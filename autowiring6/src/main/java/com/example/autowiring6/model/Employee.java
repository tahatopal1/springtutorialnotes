package com.example.autowiring6.model;

public class Employee {

    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "member=" + member +
                '}';
    }
}
