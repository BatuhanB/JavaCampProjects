package Core;

public class OracleDbLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println( message + " has been logged to Oracle Database!");
    }
}
