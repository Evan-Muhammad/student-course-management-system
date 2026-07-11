package com.evan;
import com.evan.model.Course;
import com.evan.model.CourseLevel;
import com.evan.model.Department;
import com.evan.model.Student;
import com.evan.repository.CourseRepository;
import com.evan.repository.StudentRepository;
import com.evan.service.CourseService;
import com.evan.service.EnrollmentService;
import com.evan.service.StudentService;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner input=new Scanner(System.in);

    static StudentRepository studentRepository=new StudentRepository();
    static CourseRepository courseRepository=new CourseRepository();

    static StudentService studentService=new StudentService(studentRepository);
    static CourseService courseService=new CourseService(courseRepository);
    static EnrollmentService enrollmentService=new EnrollmentService(studentRepository,courseRepository);


    public static void main(String[] args) {

        int choose;

        do{
            System.out.println("===== Student Course Management =====");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students in Course");
            System.out.println("5. View Courses of Student");
            System.out.println("6. Save");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            choose=input.nextInt();
            input.nextLine();

            switch(choose){
                case 1:
                    manageStudents();
                    break;

                case 2:
                    manageCourses();
                    break;

                case 3:
                    enrollStudent();
                    break;

                case 4:
                    viewStudentsInCourse();
                    break;

                case 5:
                    viewCoursesOfStudent();
                    break;

                case 6:
                    System.out.println("Save is not done yet");
                    break;

                case 7:
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();

        }while(choose!=7);

        input.close();
    }

    public static void manageStudents(){

        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.print("Choose: ");

        int choice=input.nextInt();
        input.nextLine();

        if(choice==1){

            System.out.print("Student ID: ");
            int id=input.nextInt();
            input.nextLine();

            System.out.print("First Name: ");
            String firstName=input.nextLine();

            System.out.print("Last Name: ");
            String lastName=input.nextLine();

            System.out.print("Email: ");
            String email=input.nextLine();

            System.out.print("Age: ");
            int age=input.nextInt();
            input.nextLine();

            studentService.addStudent(new Student(firstName,lastName,email,age,id));
            System.out.println("Student added");

        }else if(choice==2){

            studentService.viewStudent();

        }else if(choice==3){

            System.out.print("Student ID: ");
            int id=input.nextInt();
            input.nextLine();

            Student student=studentService.searchStudent(id);

            if(student!=null){
                System.out.println(student);
            }else{
                System.out.println("Student not found");
            }

        }else if(choice==4){

            System.out.print("Student ID: ");
            int id=input.nextInt();
            input.nextLine();

            studentService.updateStudent(id);

        }else if(choice==5){

            System.out.print("Student ID: ");
            int id=input.nextInt();
            input.nextLine();

            Student student=studentService.searchStudent(id);

            if(student!=null){
                studentService.deleteStudent(student);
                System.out.println("Student deleted");
            }else{
                System.out.println("Student not found");
            }

        }else{
            System.out.println("Invalid Choice");
        }
    }

    public static void manageCourses(){

        System.out.println("1. Add Course");
        System.out.println("2. View All Courses");
        System.out.println("3. Search Course by ID");
        System.out.println("4. Delete Course");
        System.out.print("Choose: ");

        int choice=input.nextInt();
        input.nextLine();

        if(choice==1){

            System.out.print("Course ID: ");
            int id=input.nextInt();
            input.nextLine();

            System.out.print("Course Name: ");
            String name=input.nextLine();

            System.out.print("Instructor: ");
            String instructor=input.nextLine();

            System.out.print("Max Capacity: ");
            int capacity=input.nextInt();
            input.nextLine();

            Department department=chooseDepartment();
            CourseLevel level=chooseCourseLevel();

            courseService.addCourse(new Course(id,name,instructor,capacity,department,level));
            System.out.println("Course added");

        }else if(choice==2){

            courseService.viewCourse();

        }else if(choice==3){

            System.out.print("Course ID: ");
            int id=input.nextInt();
            input.nextLine();

            Course course=courseService.searchCourse(id);

            if(course!=null){
                System.out.println(course);
            }else{
                System.out.println("Course not found");
            }

        }else if(choice==4){

            System.out.print("Course ID: ");
            int id=input.nextInt();
            input.nextLine();

            Course course=courseService.searchCourse(id);

            if(course!=null){
                courseService.deleteCourse(course);
                System.out.println("Course deleted");
            }else{
                System.out.println("Course not found");
            }

        }else{
            System.out.println("Invalid Choice");
        }
    }

    public static void enrollStudent(){

        System.out.print("Student ID: ");
        int studentId=input.nextInt();
        input.nextLine();

        System.out.print("Course ID: ");
        int courseId=input.nextInt();
        input.nextLine();

        Student student=studentService.searchStudent(studentId);
        Course course=courseService.searchCourse(courseId);

        if(student==null){
            System.out.println("Student not found");
            return;
        }

        if(course==null){
            System.out.println("Course not found");
            return;
        }

        try{
            enrollmentService.enrollStudent(student,course);
            System.out.println("Enrollment successful");
        }catch(Exception e){
            System.out.println("Enrollment failed: "+e.getMessage());
        }
    }

    public static void viewStudentsInCourse(){

        System.out.print("Course ID: ");
        int courseId=input.nextInt();
        input.nextLine();

        Course course=courseService.searchCourse(courseId);

        if(course==null){
            System.out.println("Course not found");
            return;
        }

        enrollmentService.listStudentsInCourse(course);
    }

    public static void viewCoursesOfStudent(){

        System.out.print("Student ID: ");
        int studentId=input.nextInt();
        input.nextLine();

        Student student=studentService.searchStudent(studentId);

        if(student==null){
            System.out.println("Student not found");
            return;
        }

        enrollmentService.listCoursesForStudent(student);
    }

    public static Department chooseDepartment(){

        Department[] departments=Department.values();

        System.out.println("Select Department:");
        for(int i=0;i<departments.length;i++){
            System.out.println((i+1)+". "+departments[i]);
        }
        System.out.print("Choose: ");

        int choice=input.nextInt();
        input.nextLine();

        return departments[choice-1];
    }

    public static CourseLevel chooseCourseLevel(){

        CourseLevel[] levels=CourseLevel.values();

        System.out.println("Select Course Level:");
        for(int i=0;i<levels.length;i++){
            System.out.println((i+1)+". "+levels[i]);
        }
        System.out.print("Choose: ");

        int choice=input.nextInt();
        input.nextLine();

        return levels[choice-1];
    }
}
