import java.util.Arrays;
import java.util.Scanner;

public class EnYakin {
    public static void main(String[] args) {
        ///////////////////////////////////////////////
        int[] arr = new int[10];
        int random;
        for (int i = 0; i<arr.length; i++) {
          random = (int) (Math.random()*10); //fill array with random integer numbers
          arr[i] = random;
        } 
        System.out.println("Dizi :" + Arrays.toString(arr));
        //////////////////////////////////////////////
        Scanner getInput = new Scanner(System.in);
        int low = 0,high = 0;
        System.out.println();
        System.out.print("Girilen sayi : " );
        int input = getInput.nextInt();
        getInput.close();
        Arrays.sort(arr);
        if(arr[0] == input){
            low = 0;
            high = arr[1];
        }else if(arr[9]==input){
            low = arr[8];
            high = 0;

        }else{
            for(int i = 0; i<arr.length;i++){
                if(arr[i]==input){
                    low = arr [i -1];
                    high = arr[i+ 1];
                    break;  
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + low);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + high);
    }
    
}
