import java.util.*;;
public class VucutKitleIndexHesaplama {
    public static void main(String[] args) {
        double weight,tall,index;
        Scanner getInput = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        tall = getInput.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = getInput.nextDouble();
        index = weight / (tall * tall);
        System.out.println("Vücut Kitle İndeksiniz :  " + index);
        System.out.print("\n\tKilo:"+weight+"\tBoy:"+tall+"\tİndex:"+index);
        getInput.close();
    }
}