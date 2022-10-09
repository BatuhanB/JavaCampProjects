public class CustomerManager {
    private final BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Customer has been added!");
        logger.log("customer information");
    }
}
