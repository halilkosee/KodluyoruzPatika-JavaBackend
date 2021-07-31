import java.util.Scanner;
/**
 * GirilenSayiyaKadarKuvvetleriYazma
 */
public class GirilenSayiyaKadarKuvvetleriYazma {

    public static void main(String[] args) {
        int n;
        boolean check4 = false,check5 =false;
        boolean loop = false;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = getInput.nextInt();
        System.out.print( n +"'e kadar olan sayılardan 4 veya 5 kuvetleri olan sayilar : ");
        
        for(int i = 0; i<=n; i++){
            double tempI = (double)i;
            while(tempI>1){
                tempI /= (double)4;
                if(tempI<(double)2 && tempI>(double)1){
                    check4 = false;
                }
                if(tempI == 1.0){
                    check4 = true;
                }
            }
            tempI = (double)i;
            while(tempI>1){
                tempI /= (double)5;
                if(tempI<(double)2 && tempI>(double)1){
                    check4 = false;
                }
                if(tempI == 1.0){
                    check5 = true;
                }
            }
            if ( check4 == true  || check5 == true) {
                System.out.print(i + " ");
                check4 = false;
                check5 = false;
            }
        }
        getInput.close();
    }
}