package Core;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println( message + " has been logged to File!");
    }
}
