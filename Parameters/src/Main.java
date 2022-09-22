public class Main {
    public static void main(String[] args) {
        float number1 = 12;
        float number2 = 5;
        Sum(number1,number2);
        Substract(number1,number2);
        Divide(number1,number2);
        Multiple(number1,number2);
    }
    public static void Sum(float number1,float number2){
        float result = number1 + number2;
        System.out.println("The sum of inputs is = " + result);
    }
    public static void Substract(float number1,float number2){
        float result = number1 - number2;
        System.out.println("The substraction of inputs is = " + result);
    }
    public static void Divide(float number1,float number2){
        float result = number1 / number2;
        System.out.println("The division of inputs is = " + result);
    }
    public static void Multiple(float number1,float number2){
        float result = number1 * number2;
        System.out.println("The multiplication of inputs is = " + result);
    }
}
