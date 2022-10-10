package Repositories.Repo;

import Models.Course;
import Repositories.CourseDao;

import java.util.List;

public class CourseJdbcRepository implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getName() + " has been added using JDBC!");
    }

    @Override
    public void delete(Course course) {
        System.out.println(course.getName() + " has been deleted using JDBC!");
    }

    @Override
    public void update(Course course) {
        System.out.println(course.getName() + " has been updated using JDBC!");
    }

    @Override
    public List<Course> list(List<Course> courses) {
        return courses;
    }
}
