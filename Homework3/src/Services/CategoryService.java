package Services;

import Core.Logger;
import Models.Category;
import Repositories.CategoryDao;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private final Logger[] loggers;
    private final CategoryDao categoryDao;
    private final List<Category> categoryList = new ArrayList<Category>();
    Category instance = new Category(1,"Web Programming");


    public CategoryService(Logger[] loggers, CategoryDao categoryDao) {
        this.loggers = loggers;
        this.categoryDao = categoryDao;
    }

    public void add(Category category) throws Exception{
        categoryList.add(instance);
        String message = category.getName();
        for(Category c:categoryList){
            if(c.getName().equals(category.getName())){
                throw new Exception("Entered category name has already exists!");
            }
        }
        categoryDao.add(category);
        for(Logger logger : loggers){
            logger.log(message);
        }
    }
}
