package com.example.beaninheritance7.model;

import java.util.List;

public class MemberList {
    private List<String> memberList;

    public List<String> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<String> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "MemberList{" +
                "memberList=" + memberList +
                '}';
    }
}
