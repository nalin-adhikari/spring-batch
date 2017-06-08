/**
 * 
 */
package com.nalin.springbatch.domain;

/**
 * You can instantiate the Person class either with first and last name through a constructor, 
 * or by setting the properties.
 * 
 * @author nalin
 * @since June 8, 2017
 *
 */
public class Person {

	private String lastName;
    private String firstName;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }
}
