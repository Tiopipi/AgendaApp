package org.ulpgc.IS.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
        contactList = new ArrayList<>();
    }
}
