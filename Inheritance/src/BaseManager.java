public  class BaseManager {
    public void listInformation(Customer customer,Company company,Person person){
        System.out.println("+++++++++++  Customer +++++++");
        System.out.println(customer.getId() + "\n" + customer.getMail() + "\n" + customer.getPassword());
    }
}
