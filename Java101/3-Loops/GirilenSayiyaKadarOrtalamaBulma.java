import java.util.Scanner;

/**
 * GirilenSayiyaKadarOrtalamaBulma
 */
public class GirilenSayiyaKadarOrtalamaBulma {
    public static void main(String[] args) {
        int k,counter=0,sum=0;
        double average;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter an integer:");
        k = getInput.nextInt();
        for(int i = 0; i<=k; i++){
            if ((i%3 == 0) && (i%4 == 0) && (i != 012)) {
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        if (counter != 0) {
            average = sum/counter;
        }else{
            average = 0;
        }
        System.out.printf("Average the multiples of (3 and 4) : %f",average);
        getInput.close();
    }
    
    
}