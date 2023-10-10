package org.ulpgc.IS.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.*;
import java.time.format.*;

public class Member {
    public Contact getContact() {
        return contact;
    }

    private Contact contact;

    public LocalDateTime getDate() {
        return date;
    }

    private LocalDateTime date;
    private Group group;

    public Member(Contact contact, LocalDateTime date) {
        this.contact = contact;
        this.date = date;
    }




}
