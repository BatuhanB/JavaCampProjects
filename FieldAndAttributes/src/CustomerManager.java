class CustomerManager {

    public static void SaveCustomer(CustomerEntity customer) {
        System.out.println(
                customer.FirstName + " "
                + customer.LastName + " - "
                + customer.Age + " - "
                + customer.DateOfBirth + " - "
                + customer.IdNumber+ " has been saved to database!");
    }

}
