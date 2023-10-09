package org.ulpgc.IS.model;

public class Person extends Contact{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAddress(street, number, floor, city);
        setEmail(email);
        setTelephone(telephone);

    }
    @Override
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
