package com.evan.service;
import com.evan.model.Course;
import com.evan.repository.CourseRepository;

public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }

    public void addCourse(Course course){
        courseRepository.add(course);
    }

    public void viewCourse(){
        System.out.println(courseRepository.getAll());
    }

    public Course searchCourse(int courseId){

        for(Course course:courseRepository.getAll()){

            if(course.getCourseId()==courseId){
                return course;
            }

        }

        return null;
    }

    public void deleteCourse(Course course){
        courseRepository.remove(course);
    }
}
