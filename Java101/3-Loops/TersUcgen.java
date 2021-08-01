import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Basamak Sayısı :");
        int n = getInput.nextInt();
        for (int i = n-1; i >= 0 ; i--) {
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
