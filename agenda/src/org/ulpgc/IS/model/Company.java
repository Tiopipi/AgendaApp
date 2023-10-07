package org.ulpgc.IS.model;

public class Company extends Contact{
    private String name;
    private String description;

    public Company(String name, String description, String telephone, String email, String street, int number, int floor, String city) {
        this.name = name;
        this.description = description;
        setAddress(street, number, floor, city);
        setEmail(email);
        setTelephone(telephone);

    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
