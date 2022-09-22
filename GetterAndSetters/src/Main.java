public class Main {
    public static void main(String[] args) {
        Category model = CategoryManager.AddCategory(1,"Electronic","12.12.2022",true);
        CategoryManager.ListCategory(model);
    }
}
