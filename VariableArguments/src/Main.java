public class Main {
    public static void main(String[] args) {
       //int number1 = 12; int number2 = 2; int number3 = 7; int number4 = 9;
       int result = ArgsSum(1,12,32,54,75);
        System.out.println("The sum of numbers: " + result);
    }

    public static int ArgsSum(int... numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }
}
