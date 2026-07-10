package com.evan.model;

public class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student=student;
        this.course=course;
    }

    public void setStudent(Student student){
        this.student=student;
    }
    public Student getStudent(){
        return this.student;
    }


    public void setCourse(Course course){
        this.course=course;
    }
    public Course getCourse(){
        return this.course;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}

