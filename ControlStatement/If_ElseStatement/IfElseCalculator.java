import java.util.Scanner;

public class IfElseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("ENter the type of operation you want to perform(+,-,*,/,%):");
        String operation = sc.next();
        int result = performOperation(num1, num2, operation);
        System.out.println("Your answer is= " + result);
    }

    public static int performOperation(int num1, int num2, String operation) {
        int result = 0;
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            result = num1 / num2;
        } else if (operation.equals("%")) {
            result = num1 % num2;
        } else {
            System.out.println("Invalid operatioin");
        }
        return result;

    }
}
