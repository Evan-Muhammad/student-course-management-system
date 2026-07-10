package com.evan.service;
import com.evan.model.Course;
import com.evan.model.Enrollment;
import com.evan.model.Student;
import com.evan.repository.CourseRepository;
import com.evan.repository.StudentRepository;
import java.util.HashSet;
import java.util.Set;

public class EnrollmentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    private HashSet<Enrollment> enrollments=new HashSet<>();

    public EnrollmentService(StudentRepository studentRepository, CourseRepository courseRepository){
        this.studentRepository=studentRepository;
        this.courseRepository=courseRepository;
    }

    public void enrollStudent(Student student, Course course){

    }

    public void removeEnrollment(Student student, Course course){

    }

    public void listStudentsInCourse(Course course){

    }

    public void listCoursesForStudent(Student student){

    }
}
