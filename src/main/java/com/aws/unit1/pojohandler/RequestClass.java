package com.aws.unit1.pojohandler;

/**
 * @author linahovanessian on 6/28/18.
 */
public class RequestClass {


    private String firstName;
    private String lastName;

    public RequestClass() {

    }

    public RequestClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + " lastName: " + lastName;
    }
}
