import java.util.*;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int c1,c2,c3,c4,c5,c6; //c refers course
        Scanner input = new Scanner(System.in);
        System.out.print("Enter c1 result : ");
        c1 = input.nextInt();
        System.out.print("Enter c2 result : ");
        c2 = input.nextInt();
        System.out.print("Enter c3 result : ");
        c3 = input.nextInt();
        System.out.print("Enter c4 result : ");
        c4 = input.nextInt();
        System.out.print("Enter c5 result : ");
        c5 = input.nextInt();
        System.out.print("Enter c6 result : ");
        c6 = input.nextInt();
        float avg = ((c1 + c2 + c3 + c4 + c5 + c6)/ 6);
        String result;
        result = (avg>=60)? "Passed" : "Failed";
        System.out.print("Avarage is : " + avg + "=>" + result );
        input.close();
    }
}
