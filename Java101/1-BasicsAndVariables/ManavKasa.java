import java.util.*;
public class ManavKasa {
    public static void main(String[] args) {
        double total=0;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        total += getInput.nextDouble() * 2.14;
        System.out.print("Elma Kaç Kilo ? :");
        total += getInput.nextDouble() * 3.67;
        System.out.print("Domates Kaç Kilo ? :");
        total += getInput.nextDouble() * 1.11;
        System.out.print("Muz Kaç Kilo ? :");
        total += getInput.nextDouble() * 0.95;
        System.out.print("Patlıcan Kaç Kilo ? :");
        total += getInput.nextDouble() * 5.0;
        System.out.print("Toplam Tutar : "+ total);
        getInput.close();
    }
}