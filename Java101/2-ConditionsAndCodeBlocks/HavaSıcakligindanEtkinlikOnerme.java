import java.util.*;
public class HavaSıcakligindanEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        float cond;
        System.out.print("HAVA DURUMU GİRİN:");
        cond = getInput.nextFloat();
        if (cond <=5 ){
            System.out.print("Kayak");
        }else if( cond>5 && cond <= 15 ){
            System.out.print("Siname");
        }
        else if(cond >15 && cond<=25){
            System.out.print("Piknik");
        }
        else{
            System.out.print("Yüzme");
        }
        getInput.close();
    }
}