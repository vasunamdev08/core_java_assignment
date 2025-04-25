package day1.worksheet;
class BasicCalculator {

    // Final method - cannot be overridden
    public final int add(int a, int b) {
        return a + b;
    }
}
class SmartCalculator extends BasicCalculator {

    // ❌ This will cause a compilation error:
    /*
    @Override
    public int add(int a, int b) {
        return a + b + 1; // Not allowed - method is final in parent class
    }
    */

    // New method in subclass
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class Q7_CalculatorLockdown {
    public static void main(String[] args) {
        SmartCalculator calc = new SmartCalculator();

        System.out.println("Addition: " + calc.add(10, 5));      // from BasicCalculator
        System.out.println("Subtraction: " + calc.subtract(10, 5)); // from SmartCalculator
    }
}
