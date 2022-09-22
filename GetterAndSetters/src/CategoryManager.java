class CategoryManager {
    public static void ListCategory(Category category){
        System.out.println(" ID: " + category.getId()
                + "\n Name: " +  category.getName()
                + "\n Create Date: " + category.getCreatedDate()
                + "\n Status: " +  category.getIsActive());
        System.out.println("Category has been listed successfully!");
    }
    public static Category AddCategory(int id,String name,String createDate,boolean status){
        Category category = new Category();
        category.setId(id);
        category.setName(name);
        category.setCreatedDate(createDate);
        category.setActive(status);

        //System.out.println("Category has been added to db!");
        return category;
    }
}
