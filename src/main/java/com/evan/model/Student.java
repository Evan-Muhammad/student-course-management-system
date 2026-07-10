package com.evan.model;

public class Student extends Person {

    private int studentId;

    public Student(String firstName, String lastName, String email, int age, int studentId) {
        super(firstName, lastName, email, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
