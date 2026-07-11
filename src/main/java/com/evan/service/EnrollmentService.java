package com.evan.service;

import com.evan.exception.CourseFullException;
import com.evan.exception.StudentNotFoundException;
import com.evan.model.Course;
import com.evan.model.Enrollment;
import com.evan.model.Student;
import com.evan.repository.CourseRepository;
import com.evan.repository.StudentRepository;

import java.util.HashSet;

public class EnrollmentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    private HashSet<Enrollment> enrollments=new HashSet<>();

    public EnrollmentService(StudentRepository studentRepository,CourseRepository courseRepository){
        this.studentRepository=studentRepository;
        this.courseRepository=courseRepository;
    }

    public void enrollStudent(Student student,Course course)throws StudentNotFoundException,CourseFullException{

        boolean found=false;

        for(Student s:studentRepository.getAll()){
            if(s.getStudentId()==student.getStudentId()){
                found=true;
            }
        }

        if(!found){
            throw new StudentNotFoundException("Student not found");
        }

        int count=0;

        for(Enrollment e:enrollments){

            if(e.getStudent().getStudentId()==student.getStudentId()&&
                    e.getCourse().getCourseId()==course.getCourseId()){
                System.out.println("Student already enrolled");
                return;
            }

            if(e.getCourse().getCourseId()==course.getCourseId()){
                count++;
            }
        }

        if(count>=course.getMaxCapacity()){
            throw new CourseFullException("Course is full");
        }

        enrollments.add(new Enrollment(student,course));
    }

    public void removeEnrollment(Student student,Course course){

        Enrollment remove=null;

        for(Enrollment e:enrollments){
            if(e.getStudent().getStudentId()==student.getStudentId()&&
                    e.getCourse().getCourseId()==course.getCourseId()){
                remove=e;
            }
        }

        if(remove!=null){
            enrollments.remove(remove);
        }
    }

    public void listStudentsInCourse(Course course){

        for(Enrollment e:enrollments){
            if(e.getCourse().getCourseId()==course.getCourseId()){
                System.out.println(e.getStudent());
            }
        }
    }

    public void listCoursesForStudent(Student student){

        for(Enrollment e:enrollments){
            if(e.getStudent().getStudentId()==student.getStudentId()){
                System.out.println(e.getCourse());
            }
        }
    }
}