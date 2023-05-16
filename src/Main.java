public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(
                calculator.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intCalculator = new IntsCalculator();
        System.out.println(intCalculator.sum(2, 2));
        System.out.println(intCalculator.sum(10, 22));
        System.out.println(intCalculator.pow(2, 10));

    }
}