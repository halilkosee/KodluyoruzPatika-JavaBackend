import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = getInput.nextInt();

        for (int i = 0; i <= n - 1 ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }






        getInput.close();

    }
}