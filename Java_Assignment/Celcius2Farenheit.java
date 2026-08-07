import java.util.Scanner;

public class Celcius2Farenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double c = input.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println(f);
    }
}
