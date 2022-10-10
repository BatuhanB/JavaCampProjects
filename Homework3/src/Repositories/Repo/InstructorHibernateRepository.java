package Repositories.Repo;

import Models.Instructor;
import Repositories.InstructorDao;

import java.util.List;

public class InstructorHibernateRepository implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has been added using HIBERNATE!");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has been deleted using HIBERNATE!");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has been updated using HIBERNATE!");
    }

    @Override
    public List<Instructor> list(List<Instructor> instructors) {
        return instructors;
    }
}
