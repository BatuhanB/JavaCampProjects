class StudentManager {
    public static void List(Student student){
        System.out.println(" ID: " + student.getId()
                          + "\n Name: " +student.getName()
                          + "\n Class: " +student.getClasses());
    }
    public static Student Add(Student student){
        int id = student.getId();
        String name = student.getName();
        String classes = student.getClasses();

        student.setId(id);
        student.setName(name);
        student.setClasses(classes);
        return  student;
    }
}
