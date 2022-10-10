public class Main {
    public static void main(String[] args) {
       /* GameCalculator calculator = new ManGameCalculator();
        calculator.calculate();
        calculator.printGameOver();*/
        GameCalculator calculator = new WomanGameCalculator();
        calculator.calculate();
        calculator.printGameOver();
    }
}
