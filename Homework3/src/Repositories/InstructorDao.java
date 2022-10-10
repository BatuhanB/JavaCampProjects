package Repositories;

import Models.Category;
import Models.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);
    void delete(Instructor instructor);
    void update(Instructor instructor);
    List<Instructor> list(List<Instructor> instructors);
}
