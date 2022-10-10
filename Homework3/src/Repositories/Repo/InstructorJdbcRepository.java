package Repositories.Repo;

import Models.Instructor;
import Repositories.InstructorDao;

import java.util.List;

public class InstructorJdbcRepository implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has been added using JDBC!");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has been deleted using JDBC!");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has been updated using JDBC!");
    }

    @Override
    public List<Instructor> list(List<Instructor> instructors) {
        return instructors;
    }
}
