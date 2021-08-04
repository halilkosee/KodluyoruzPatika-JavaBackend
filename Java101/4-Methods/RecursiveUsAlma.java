import java.util.Scanner;

public class RecursiveUsAlma {
    static int power(int number, int power){
        if(power == 0){
            return 1;
        }
        return number * power(number, power - 1);
    }
    public static void main(String[] args) {   
        Scanner getInput  = new Scanner(System.in);
        System.out.print("Üssü alınacak değer : ");
        int number = getInput.nextInt();
        System.out.print("Üs değeri : ");
        int power = getInput.nextInt();
        System.out.println("Sonuc = " + power(number, power));
    } 
}
