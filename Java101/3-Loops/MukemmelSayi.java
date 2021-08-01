import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int number,modNumber = 0,sum = 0;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        number = getInput.nextInt();
        getInput.close();
        while(modNumber != number-1){
            modNumber++;
            if(number%modNumber == 0){
                sum +=modNumber;
            }
        }
        if(sum == number){
            System.out.println( number + " Mükemmel sayıdır");
        }else{
            System.out.println(number + " Mükemmel sayı değildir");
        }
    }
}
