import java.util.*;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        float a,b,c;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter triange edge 1 : ");
        a = getInput.nextFloat();
        System.out.print("Enter triange edge 2 : ");
        b = getInput.nextFloat();
        System.out.print("Enter triange edge 2 : ");
        c = getInput.nextFloat();
        float u = (a + b + c)/2;
        float area = (float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Area : " + area);
        getInput.close();
    }
}