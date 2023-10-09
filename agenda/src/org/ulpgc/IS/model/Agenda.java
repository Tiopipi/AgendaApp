package org.ulpgc.IS.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public List<Contact> getContactList() {
        return contactList;
    }

    private List<Contact> contactList;

    public List<Group> getGroupList() {
        return groupList;
    }

    private List<Group> groupList;

    public Agenda() {
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }
    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city){
        this.contactList.add(new Person(firstName, lastName, telephone, email, street, number, floor, city));
    }
    public void addCompany(String name, String description, String telephone, String email, String street, int number, int floor, String city){
        this.contactList.add(new Company(name, description, telephone, email, street, number, floor, city));
    }
    public void addGroup(String name) {
        this.groupList.add(new Group(name));
    }


}
