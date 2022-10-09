public class CompanyManager extends BaseManager{
    @Override
    public void listInformation(Customer customer, Company company, Person person) {
        System.out.println("+++++++++++ Company +++++++++");
        System.out.println(company.getCompanyId() + "\n" + company.getCompanyName());
    }
}
