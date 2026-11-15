import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int firstNum = 0, secondNum = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");

            int thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }

        input.close();
    }
}
