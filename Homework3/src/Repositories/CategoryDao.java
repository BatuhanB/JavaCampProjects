package Repositories;

import Models.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
    List<Category> list(List<Category> categories);
}
