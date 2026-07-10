package com.evan.service;
import com.evan.model.Student;
import com.evan.repository.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.add(student);
    }

    public void viewStudent(){
        studentRepository.getAll();
    }

    public Student searchStudent(int studentId){
        return null;
    }

    public void updateStudent(int studentId){

    }

    public void deleteStudent(Student student){
        studentRepository.remove(student);
    }
}

