import java.util.*;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double km,perKm = 2.20,total= 10;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Gididlen Mesefayi Giriniz : ");
        km = getInput.nextDouble();
        total += km*perKm;
        System.out.print("Toplam Taksimetre ücreti :" + total);
        getInput.close();
    }
}