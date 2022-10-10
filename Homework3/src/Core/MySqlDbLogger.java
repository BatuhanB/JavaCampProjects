package Core;

public class MySqlDbLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println( message + " has been logged to MySql Database!");
    }
}
