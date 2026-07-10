package com.evan.model;

public class Course {

    private int courseId;
    private String courseName;
    private String instructor;
    private int maxCapacity;

    public Course(int courseId, String courseName, String instructor, int maxCapacity){
        this.courseId=courseId;
        this.courseName=courseName;
        this.instructor=instructor;
        this.maxCapacity=maxCapacity;
    }

    public void setCourseId(int courseId){
        this.courseId=courseId;
    }
    public int getCourseId(){
        return this.courseId;
    }


    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return this.courseName;
    }


    public void setInstructor(String instructor){
        this.instructor=instructor;
    }
    public String getInstructor(){
        return this.instructor;
    }


    public void setMaxCapacity(int maxCapacity){
        this.maxCapacity=maxCapacity;
    }
    public int getMaxCapacity(){
        return this.maxCapacity;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", maxCapacity=" + maxCapacity +
                '}';
    }
}
