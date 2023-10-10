package org.ulpgc.IS.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;

    public List<Member> getMemberList() {
        return memberList;
    }

    private List<Member> memberList = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addContact(Contact contact) {

        this.memberList.add(new Member(contact, LocalDateTime.now()));

    }

    public void removeContact(int index) {

        this.memberList.remove(index);
    }
}
