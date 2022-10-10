package Repositories.Repo;

import Models.Course;
import Repositories.CourseDao;

import java.util.List;

public class CoursesHibernateRepository implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getName() + " has been added using HIBERNATE!");
    }

    @Override
    public void delete(Course course) {
        System.out.println(course.getName() + " has been deleted using HIBERNATE!");
    }

    @Override
    public void update(Course course) {
        System.out.println(course.getName() + " has been updated using HIBERNATE!");
    }

    @Override
    public List<Course> list(List<Course> courses) {
        return courses;
    }
}
