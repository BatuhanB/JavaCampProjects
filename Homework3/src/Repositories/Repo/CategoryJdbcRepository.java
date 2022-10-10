package Repositories.Repo;

import Models.Category;
import Repositories.CategoryDao;

import java.util.List;

public class CategoryJdbcRepository implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getName() + " has been added using JDBC!");
    }

    @Override
    public void delete(Category category) {
        System.out.println(category.getName() + " has been deleted using JDBC!");
    }

    @Override
    public void update(Category category) {
        System.out.println(category.getName() + " has been updated using JDBC!");
    }

    @Override
    public List<Category> list(List<Category> categories) {
        return categories;
    }
}
