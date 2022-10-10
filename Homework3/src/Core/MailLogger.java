package Core;

public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println( message + " has been logged to Mail!");
    }
}
