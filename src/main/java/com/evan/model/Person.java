package com.evan.model;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public Person(String firstName, String lastName, String email, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.age=age;
    }


    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }


    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return this.lastName;
    }


    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }


    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

