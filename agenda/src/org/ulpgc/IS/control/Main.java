package org.ulpgc.IS.control;

import org.ulpgc.IS.model.Agenda;
import org.ulpgc.IS.model.Group;

public class Main {
    public static void init(Agenda agenda) {
        agenda.addPerson("Cristiano", "Ronaldo", "777-777-777", "cristianoronaldo@gmail.com", "AL-Nassar", 77, 7, "Arabia Saudi");
        agenda.addPerson("Jude", "Bellingham", "555-555-555", "judebellingham@gmail.com", "Plaza Mayor", 18, 1, "Madrid");
        agenda.addGroup("trabajo");
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        init(agenda);
        agenda.getGroupList().get(0).addContact(agenda.getContactList().get(0));
        System.out.println(agenda.getContactList().size());
        System.out.println(agenda.getGroupList().get(0).getContactList().size());
        agenda.getGroupList().get(0).removeContact(agenda.getContactList().get(0));
        System.out.println(agenda.getGroupList().get(0).getContactList().size());
    }
}
