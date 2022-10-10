import Core.*;
import Models.Category;
import Models.Course;
import Models.Instructor;
import Repositories.Repo.CategoryHibernateRepository;
import Repositories.Repo.CourseJdbcRepository;
import Repositories.Repo.InstructorHibernateRepository;
import Services.CategoryService;
import Services.CourseService;
import Services.InstructorService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = new Logger[]{new MailLogger(),new FileLogger(),new MySqlDbLogger(),new OracleDbLogger()};
        //This section about course processes
        System.out.println("\n*********** COURSE *************\n");
        Course course = new Course(1,"C#",new BigDecimal(1400));
        CourseService courseService = new CourseService(loggers,new CourseJdbcRepository());
        courseService.add(course);

        System.out.println("\n*********** INSTRUCTOR *************\n");

        //This section about instructor processes
        Instructor instructor = new Instructor(2,"Batuhan","Bali",22,"He is good too at his area :)");
        InstructorService instructorService = new InstructorService(loggers,new InstructorHibernateRepository());
        instructorService.add(instructor);

        System.out.println("\n*********** CATEGORY *************\n");

        //This section about category processes
        Category category = new Category(2,"Mobile Programming");
        CategoryService categoryService = new CategoryService(loggers,new CategoryHibernateRepository());
        categoryService.add(category);

    }
}
