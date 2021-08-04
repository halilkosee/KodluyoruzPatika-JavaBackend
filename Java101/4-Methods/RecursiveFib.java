import java.util.Scanner;

public class RecursiveFib {

    static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n -2);
    }
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Kaçıncı Fibonaci Değerini Görmek İstiyorsunuz : ");
        int val = getInput.nextInt();
        getInput.close();
        System.out.println("Fibonaci Serisinin " + val + ". Değeri : " + (fib(val)));

    }
    
}
