class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two numbers: " + calculator.add(10, 20));
        System.out.println("Sum of three numbers: " + calculator.add(10, 20, 30));
    }
}