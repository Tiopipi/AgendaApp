package org.ulpgc.IS.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contactList;
    private List<Group> groupList;
    public Agenda(){
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }
}
