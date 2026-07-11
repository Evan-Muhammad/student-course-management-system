package com.evan.service;
import com.evan.model.Student;
import com.evan.repository.StudentRepository;
import java.util.Scanner;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    public void addStudent(Student student){
        studentRepository.add(student);
    }

    public void viewStudent(){
        System.out.println(studentRepository.getAll());
    }

    public Student searchStudent(int studentId){

        for(Student student:studentRepository.getAll()){

            if(student.getStudentId()==studentId){
                return student;
            }

        }

        return null;
    }


    public void updateStudent(int studentId){

        Student student=searchStudent(studentId);

        if(student!=null){

            Scanner input=new Scanner(System.in);

            System.out.print("First Name: ");
            student.setFirstName(input.nextLine());

            System.out.print("Last Name: ");
            student.setLastName(input.nextLine());

            System.out.print("Email: ");
            student.setEmail(input.nextLine());

            System.out.print("Age: ");
            student.setAge(input.nextInt());

        }
    }

    public void deleteStudent(Student student){
        studentRepository.remove(student);
    }
}

