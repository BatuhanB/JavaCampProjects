package Services;

import Core.Logger;
import Models.Course;
import Repositories.CourseDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private final Logger[] loggers;
    private final CourseDao courseDao;
    private final List<Course> courses = new ArrayList<Course>();
    Course instance = new Course(2,"Java",new BigDecimal(1200));

    public CourseService(Logger[] logger, CourseDao courseDao) {
        this.loggers = logger;
        this.courseDao = courseDao;
    }


    public void add(Course course) throws Exception{
        courses.add(instance);
        String message = course.getName();
        List<Course> dbCourses = courseDao.list(courses);
        for(Course c : dbCourses){
            if(c.getName().equals(course.getName())){
               throw new Exception("Entered course name has already exists!");
            }
            if(course.getPrice().intValue() < 0){
                throw new Exception("Entered course price must be greater than 0!");
            }
        }
        courseDao.add(course);
        for (Logger logger : loggers){
            logger.log(message);
        }
    }
}
