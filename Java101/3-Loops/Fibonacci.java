import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int userInput = 9;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin listelemek istediğiniz elemanı sayısını girin :");
        userInput = getInput.nextInt();
        int previous_1 = 0, previous_2 = 0;
        for(int i = 0; i<=userInput; i++){
            if(i<2){
                System.out.print( (previous_2 + previous_1) + " ");
                previous_1 = 1;
            }else{
                System.out.print( (previous_2 + previous_1) + " ");
                int temp = previous_1;
                previous_1 = previous_1 + previous_2;
                previous_2 = temp; 
            }
            
        }
        
    }
    
}
