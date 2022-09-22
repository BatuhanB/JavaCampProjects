class StaticCustomerManager {

    public static void AddUser(String firstname, String lastname, int age) {
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been added!");
    }

    public static void UpdateUser(String firstname, String lastname, int age) {
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been updated!");
    }

    public static void DeleteUser(String firstname, String lastname, int age) {
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been deleted!");
    }

    public static void ListUser(String firstname, String lastname, int age) {
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been listed!");
    }
}
