import java.util.*;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int c1,c2,c3,c4,c5,c6,total = 0,counter = 0; //c refers course
        Scanner input = new Scanner(System.in);
        System.out.print("Enter c1 result : ");
        c1 = input.nextInt();
        if (c1<=100 && c1>=0){
            total += c1;
            counter++;
        }
        System.out.print("Enter c2 result : ");
        c2 = input.nextInt();
        if (c2<=100 && c2>=0){
            total += c2;
            counter++;
        }
        System.out.print("Enter c3 result : ");
        c3 = input.nextInt();
        if (c3<=100 && c3>=0){
            total += c3;
            counter++;
        }
        System.out.print("Enter c4 result : ");
        c4 = input.nextInt();
        if (c4<=100 && c4>=0){
            total += c4;
            counter++;
        }
        System.out.print("Enter c5 result : ");
        c5 = input.nextInt();
        if (c5<=100 && c5>=0){
            total += c5;
            counter++;
        }
        System.out.print("Enter c6 result : ");
        c6 = input.nextInt();
        if (c6<=100 && c6>=0){
            total += c6;
            counter++;
        }
        float avg = total/ counter;

        if (avg>=55){
            System.out.print("Avarage is : " + avg + "=> Passed");

        }else{
            System.out.print("Avarage is : " + avg + "=> Failed");
        }
        input.close();
    }
}
