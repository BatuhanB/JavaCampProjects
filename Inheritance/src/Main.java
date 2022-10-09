public class Main {
    public static void main(String[] args) {
        // Creating a customer instance
        Customer customer = new Customer();
        customer.setId(1);
        customer.setMail("customer@gmail.com");
        customer.setPassword("123123");
        // Creating a company instance
        Company company = new Company();
        company.setCompanyId("A7BBY1431Maf");
        company.setCompanyName("BBCorp");
        // Creating a person instance
        Person person = new Person();
        person.setId(2);
        person.setFirstName("Batuhan");
        person.setLastName("Bali");
        person.setIdentificationNumber("123123123123");
        person.setMail("batuhan@gmail.com");

        BaseManager base = new BaseManager();
        base.listInformation(customer,company,person);
        CompanyManager compManager = new CompanyManager();
        compManager.listInformation(customer,company,person);
        PersonManager personManager = new PersonManager();
        personManager.listInformation(customer,company,person);


        /*
        // Printing information of instances that we created above
        // Customer information
        System.out.println("+++++++++++  Customer +++++++");
        System.out.println(customer.getId() + "\n" + customer.getMail() + "\n" + customer.getPassword());
        // Company information
        System.out.println("+++++++++++ Company +++++++++");
        System.out.println(company.getCompanyId() + "\n" + company.getCompanyName());
        // Person information
        System.out.println("+++++++++++ Person ++++++++");
        System.out.println(person.getId() + "\n" + person.getFirstName() + "\n" + person.getLastName() + "\n" + person.getIdentificationNumber() + "\n" + person.getMail());
        */

    }
}
