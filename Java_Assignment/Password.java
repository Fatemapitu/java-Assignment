import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String passWord;

        do {
            passWord = input.next();

            if (!passWord.equals("pitu321")) {
                System.out.println("Incorrect password! \nTry again.....");
            }

        } while (!passWord.equals("pitu321"));

        System.out.println("Log in successful");

        input.close();
    }
}
