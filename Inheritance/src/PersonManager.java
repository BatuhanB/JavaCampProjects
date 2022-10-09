public class PersonManager extends BaseManager{
    @Override
    public void listInformation(Customer customer, Company company, Person person) {
        System.out.println("+++++++++++ Person ++++++++");
        System.out.println(person.getId() + "\n" + person.getFirstName() + "\n" + person.getLastName() + "\n" + person.getIdentificationNumber() + "\n" + person.getMail());
    }
}
