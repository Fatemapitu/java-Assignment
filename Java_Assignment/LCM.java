import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = 1; i > 0; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("LCM = " + i);
                break;
            }
        }

        input.close();
    }
}
