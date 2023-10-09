package org.ulpgc.IS.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;

    public List<Contact> getContactList() {
        return contactList;
    }

    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.contactList.add(contact);
    }

    public void removeContact(Contact contact) {
        this.contactList.remove(contact);
    }
}
