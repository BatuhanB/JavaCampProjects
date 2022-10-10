package Services;

import Core.Logger;
import Models.Instructor;
import Repositories.InstructorDao;

import java.util.ArrayList;
import java.util.List;

public class InstructorService {
    private final Logger[] loggers;
    private final InstructorDao instructorDao;
    private final List<Instructor> instructorList = new ArrayList<Instructor>();
    Instructor instance = new Instructor(1,"Engin","Demirog",32,"He is the best!");

    public InstructorService(Logger[] loggers, InstructorDao instructorDao) {
        this.loggers = loggers;
        this.instructorDao = instructorDao;
    }
    public void add(Instructor instructor) throws  Exception{
        String message = instructor.getLastName()  + " " + instructor.getLastName();
        instructorList.add(instance);
        for(Instructor i:instructorList){
            if(i.getId() == instructor.getId()){
                throw new Exception("Entered instructor id has already exists!");
            }
        }
        instructorDao.add(instructor);
        for(Logger logger : loggers){
            logger.log(message);
        }
    }
}
