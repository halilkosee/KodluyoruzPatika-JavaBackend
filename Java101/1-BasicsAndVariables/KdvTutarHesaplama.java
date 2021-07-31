import java.util.*;
public class KdvTutarHesaplama {
    public static void main(String[] args) {
        float price,tax,ratio;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Tutar Girin : ");
        price = getInput.nextFloat();
        ratio = (price>100)? 8 : 18;
        tax = (price/100)*ratio;
        System.out.println("Kdvsiz: " + price + "\nkdvli : " + (price+tax) + "\nkdv tutar : " + tax);
        getInput.close();
    }
}