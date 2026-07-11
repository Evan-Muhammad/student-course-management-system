package com.evan.model;

public class Course {

    private int courseId;
    private String courseName;
    private String instructor;
    private int maxCapacity;

    private Department department;
    private CourseLevel courseLevel;

    public Course(int courseId, String courseName, String instructor, int maxCapacity, Department department, CourseLevel courseLevel) {
        this.courseId=courseId;
        this.courseName=courseName;
        this.instructor=instructor;
        this.maxCapacity=maxCapacity;
        this.department=department;
        this.courseLevel=courseLevel;
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


    public void setDepartment(Department department){
        this.department=department;
    }
    public Department getDepartment(){
        return this.department;
    }


    public void setCourseLevel(CourseLevel courseLevel){
        this.courseLevel=courseLevel;
    }
    public CourseLevel getCourseLevel(){
        return this.courseLevel;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", department=" + department +
                ", courseLevel=" + courseLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course other = (Course) o;
        return this.courseId == other.courseId;
    }

    @Override
    public int hashCode() {
        return courseId;
    }
}
