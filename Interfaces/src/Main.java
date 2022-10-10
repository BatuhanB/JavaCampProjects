public class Main {
    public static void main(String[] args) {
        /*CustomerDal dal = new MySqlCustomerDal();
        dal.Add();
        CustomerDal dal1 = new OracleCustomerDal();
        dal1.Add();*/
        /*CustomerManager manager = new CustomerManager(customerDal);
        manager._customerDal = new OracleCustomerDal();
        manager.add();*/
        CustomerManager manager = new CustomerManager(new OracleCustomerDal());
        manager.add();
        CustomerManager manager1 = new CustomerManager(new MySqlCustomerDal());
        manager1.add();
    }
}
