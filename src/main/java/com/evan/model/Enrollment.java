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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enrollment)) return false;

        Enrollment other = (Enrollment) o;
        return this.student.getStudentId() == other.student.getStudentId()
                && this.course.getCourseId() == other.course.getCourseId();
    }

    @Override
    public int hashCode() {
        return student.getStudentId() + course.getCourseId();
    }
}

