import java.util.Scanner;

public class BasamakSayilarToplam {
    public static void main(String[] args) {
        int userNumber,sum = 0;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        userNumber = getInput.nextInt();
        int tempUserNumber = userNumber;
        while(tempUserNumber != 0){
            sum += tempUserNumber % 10;
            tempUserNumber /=10;
        }
        getInput.close();
        System.out.print(userNumber + " sayısının basamak değerleri toplamı " + sum +"'dır.");
    }
    
}
