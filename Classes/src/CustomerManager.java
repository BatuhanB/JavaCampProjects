public class CustomerManager {

    public void AddUser(String firstname,String lastname,int age){
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been added!");
    }

    public void UpdateUser(String firstname,String lastname,int age){
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been updated!");
    }

    public void DeleteUser(String firstname,String lastname,int age){
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been deleted!");
    }

    public void ListUser(String firstname,String lastname,int age){
        System.out.println(firstname + " " + lastname + " " + age + " year old user has been listed!");
    }
}
