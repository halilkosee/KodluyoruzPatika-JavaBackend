import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        int n,r,pow = 1;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = getInput.nextInt(); 
        System.out.print("Us Giriniz : ");
        r = getInput.nextInt();
        for(int i = 0; i < r; i++){
            pow *= n;
        }
        System.out.print("Sonuc : " + pow);
        getInput.close();

    }
    
}
