import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int a = 126,b = 32, min,max,counter = 0,inCounter = 0, ebob = 1, ekok = 1;
        Scanner getInput = new Scanner (System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        a = getInput.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        b = getInput.nextInt();
        getInput.close();
        boolean exit = false;
        if(a>b){
            min = b;
            max = a;
        }else{
            min = a;
            max = b;
        }
        //ebob
        while ( counter != min ) {
            counter ++;
            if((min%counter == 0 && max%counter == 0) && counter>ebob ){
                ebob = counter;
            }
        }

        //ekok
        counter = 0;
        while (exit == false) {
            counter++;
            inCounter = 0;
            while(max * counter > min * inCounter ){
                inCounter++;
                if(max*counter == min * inCounter){
                    ekok =  min * inCounter;
                    exit = true;
                    break;
                }
            }
        }
        System.out.print("ebob: "+ebob+" ekok: "+ekok);
    }
}
