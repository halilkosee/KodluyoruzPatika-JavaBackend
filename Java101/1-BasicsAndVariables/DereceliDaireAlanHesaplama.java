import java.util.*;
public class DereceliDaireAlanHesaplama {
    public static void main(String[] args) {
        float r,pie,area;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Yarıçapı Girin : ");
        r = getInput.nextFloat();
        System.out.print("Hesaplanmak İstenen Alan Derecesi Girin : ");
        pie = getInput.nextFloat();
        pie %= 360;
        area = (float) ((3.14*r*r*pie)/360);
        System.out.print(r + " Yarıçaplı Dairenin "+ pie + " Derecelik Alanı : " + area);
        getInput.close();
    }
}