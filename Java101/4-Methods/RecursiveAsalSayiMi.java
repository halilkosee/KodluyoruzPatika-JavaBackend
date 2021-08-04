import java.util.Scanner;

public class RecursiveAsalSayiMi {
    static boolean isPrime(int number,int half){
        if(half == 1){
            return true;
        }
        if(number<2){
            return false;
        }
        return ( !(number % half == 0) && isPrime(number,half-1));
    }
    public static void main(String[] args) {
        Scanner getInput  = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = getInput.nextInt();
        getInput.close();
        if(isPrime(number, number/2)){
            System.out.print("Asal");

        }else{
            System.out.print("Asal değil");
        }  
    }
}
