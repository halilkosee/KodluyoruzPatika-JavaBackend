import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int c,n,r,nFact = 1,rFact = 1,difFact = 1;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Küme Elemean Sayısı: ");
        n = getInput.nextInt(); 
        System.out.print("Kombinasyon Eleman Sayısı: ");
        r = getInput.nextInt();

        for(int i=1; i<=n; i++){
            nFact *= i;
        }
        for(int i=1; i<=r; i++){
            rFact *= i;
        }
        for(int i=1; i<=n-r; i++){
            difFact *= i;
        }
        c = nFact/(rFact * difFact);
        System.out.printf("C(%d,%d) = %d",n,r,c);
        getInput.close();  
    }
    
}
