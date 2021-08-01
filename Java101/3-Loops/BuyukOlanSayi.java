import java.util.Scanner;

public class BuyukOlanSayi {
    public static void main(String[] args) {
        int size = 4,number,max = 0;
        Scanner getInput = new Scanner (System.in); 
        System.out.print("Kaç Sayı Gireceksiniz : " );
        size = getInput.nextInt();
        for(int  i = 0; i < size; i ++){
            System.out.print( i+1 + ". sayıyı giriniz: ");
            number = getInput.nextInt();
            if(i == 0){
                max = number;
            }
            else{
                if(number >= max){
                    max = number;
                }
            }
        }
        System.out.print("Girdiğiniz en büyük sayı : " + max);
        getInput.close();

    }
}
