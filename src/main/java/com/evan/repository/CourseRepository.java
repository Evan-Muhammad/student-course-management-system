package com.evan.repository;
import com.evan.model.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements Repository<Course> {

    public ArrayList<Course> courses = new ArrayList<>();

    @Override
    public void add(Course item) {
        courses.add(item);
    }

    @Override
    public void remove(Course item) {
        courses.remove(item);
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }
}
