package com.evan.repository;
import com.evan.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Repository<Student> {

    private ArrayList<Student> students=new ArrayList<>();

    @Override
    public void add(Student item) {
        students.add(item);
    }

    @Override
    public void remove(Student item) {
        students.remove(item);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
