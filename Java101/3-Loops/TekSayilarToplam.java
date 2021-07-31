import java.util.Scanner;

/**
 * TekSayilarToplam
 */
public class TekSayilarToplam {

    public static void main(String[] args) {
        int n = 0,sum=0;
        Scanner getInput = new Scanner(System.in);
        do {
            System.out.print("Sayi giriniz :");
            n = getInput.nextInt();
            if ((n % 2 == 0) && (n % 4 == 0)) {
                System.out.println("Koşula uyan sayı, Toplama yapıldı");
                sum += n;
            }else{
                System.out.println("Sayı koşula uymuyor");
            } 
        } while (n%2!=1);
        System.out.print("İşlem Gerçekleşti\nToplam = " + sum);
        getInput.close();
    }
}