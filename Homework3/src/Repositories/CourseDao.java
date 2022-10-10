package Repositories;

import Models.Category;
import Models.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    void update(Course course);
    List<Course> list(List<Course> courses);
}
