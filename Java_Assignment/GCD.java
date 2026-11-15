import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = num1; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("GCD = " + i);
                break;
            }
        }

        input.close();
    }
}
