public class Main {
    public static void main(String[] args) {
        CustomerEntity customer = new CustomerEntity();
        customer.FirstName = "Batuhan";
        customer.LastName = "Bali";
        customer.Age = 22;
        customer.DateOfBirth = "20.12.1999";
        customer.IdNumber = "11111111111";

        CustomerManager.SaveCustomer(customer);
    }
}
