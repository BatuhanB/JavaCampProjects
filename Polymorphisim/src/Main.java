public class Main {
    public static void main(String[] args) {
        /*MailLogger mailLogger = new MailLogger();
        mailLogger.log("mail12");
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("file12");
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("data12");*/

        /*BaseLogger[] baseLoggers = new BaseLogger[]{new MailLogger(),new DatabaseLogger(), new FileLogger()};
        for (BaseLogger logs: baseLoggers) {
            logs.log("message");
        }*/

        CustomerManager  manager = new CustomerManager(new DatabaseLogger());
        manager.Add();
    }
}
