public class Main {
    public static void main(String[] args) {
        String Firstname = "Batuhan";String Lastname = "Bali";int Age = 22;
        CustomerManager manager = new CustomerManager();
        manager.AddUser(Firstname,Lastname,Age);
        manager.UpdateUser(Firstname,Lastname,Age);
        manager.DeleteUser(Firstname,Lastname,Age);
        manager.ListUser(Firstname,Lastname,Age);

        System.out.println("==================================");
        System.out.println("== Static Class Also Used ==");
        StaticCustomerManager.AddUser(Firstname,Lastname,Age);
        StaticCustomerManager.UpdateUser(Firstname,Lastname,Age);
        StaticCustomerManager.DeleteUser(Firstname,Lastname,Age);
        StaticCustomerManager.ListUser(Firstname,Lastname,Age);
    }
}