import java.util.*;

public class ArtikYil {
    public static void main(String[] args) {

        int year;
        Scanner getYear = new Scanner(System.in);
        boolean a = false;
        System.out.print("Yıl Giriniz : ");
        year = getYear.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    a = true;
                else
                    a = false;
            }
            else
                a = true;
        }
        else
            a = false;

        if(a)
            System.out.println(year + " bir artık yıldır !");
        else
            System.out.println(year + " bir artık yıl değildir !");
        getYear.close();
    }
    
}
