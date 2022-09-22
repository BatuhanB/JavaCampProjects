public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Batuhan Bali","C1");
        Student list = StudentManager.Add(student);
        StudentManager.List(list);
    }
}
