import java.util.*;

public class BurcBulma {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğduğunuz ayı yazınız");
        String ay = input.next();

        System.out.println("Lütfen doğduğunuz günü yazınız");
        int gun=input.nextInt();

        String burc="";

        if (ay.equalsIgnoreCase("Ocak"))
        {
            if (gun>22)
                burc="Kova";
            else
                burc="Oğlak";
        }

        if (ay.equalsIgnoreCase("Şubat"))
        {
            if (gun>20)
                burc="Balık";
            else
                burc="Kova";
        }

        if (ay.equalsIgnoreCase("Mart"))
        {
            if (gun>21)
                burc="Koç";
            else
                burc="Balık";
        }

        if (ay.equalsIgnoreCase("Nisan"))
        {
            if (gun>21)
                burc="Boğa";
            else
                burc="Koç";
        }

        if (ay.equalsIgnoreCase("Mayıs"))
        {
            if (gun>22)
                burc="İkizler";
            else
                burc="Boğa";
        }

        if (ay.equalsIgnoreCase("Haziran"))
        {
            if (gun>23)
                burc="Yengeç";
            else
                burc="İkizler";
        }

        if (ay.equalsIgnoreCase("Temmuz"))
        {
            if (gun>23)
                burc="Aslan";
            else
                burc="Yengeç";
        }

        if (ay.equalsIgnoreCase("Ağustos"))
        {
            if (gun>23)
                burc="Başak";
            else
                burc="Aslan";
        }

        if (ay.equalsIgnoreCase("Eylül"))
        {
            if (gun>23)
                burc="Terazi";
            else
                burc="Başak";
        }

        if (ay.equalsIgnoreCase("Ekim"))
        {
            if (gun>23)
                burc="Akrep";
            else
                burc="Terazi";
        }

        if (ay.equalsIgnoreCase("Kasım"))
        {
            if (gun>22)
                burc="Yay";
            else
                burc="Akrep";
        }

        if (ay.equalsIgnoreCase("Aralık"))
        {
            if (gun>22)
                burc="Oğlak";
            else
                burc="Yay";
        }

        System.out.println(gun+" "+ay+" "+" gününde doğduysanız burcunuz da "+burc+" olur");
    input.close();
    }
}

