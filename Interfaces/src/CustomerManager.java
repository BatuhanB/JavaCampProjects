public class CustomerManager {
    //CustomerDal _customerDal; Strategy pattern

    private final CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }


    public void add(){
        customerDal.Add();
    }
}
