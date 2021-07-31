import java.util.*;

public class UcakBileti {
    public static void main(String[] args) {
        double perKM = 0.10;
        int km,roundTrip;
        short age;
        double standartTicketPrice = 0;
        double price = 0;

        Scanner getInput = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = getInput.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = getInput.nextShort();
        System.out.print("Yolculuk Tipini Giriniz(Tek Yön(1) Gidiş Dönüş(2) :");
        roundTrip = getInput.nextInt();
        if ( km < 0 || age < 0 || (roundTrip > 2 || roundTrip < 0)){
            System.out.println("Hatalı Giriş Yaptınız");
        }else{
            standartTicketPrice = (double) km * perKM;
            price = standartTicketPrice;
            if (age<=12){
                price = standartTicketPrice - (standartTicketPrice * 0.50);
            }
            else if(age>12 && age<=24){
                price = standartTicketPrice - (standartTicketPrice * 0.10);
            }
            else if(age >= 65){
                price = standartTicketPrice - (standartTicketPrice * 0.30);
            }
            if (roundTrip == 2){
                double ifRound;
                ifRound = (price * 0.20);
                price -= ifRound;
                price *=2;
            }
            System.out.printf("Toplam Tutar : %f",price);
        }
        getInput.close();
    }
}
