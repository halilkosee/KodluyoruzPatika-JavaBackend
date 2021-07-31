import java.util.*;
public class Siralama {
    public static void main(String[] args) {
        int num1, num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers to be sorted: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if ( (num1 >= num2 && num1 >= num3) && num2 >= num3 )
            System.out.printf("Sorted numbers are %d %d %d", num3, num2, num1);
        else if ((num1 >= num2 && num1 >= num3) && num3 >= num2)
            System.out.printf("Sorted numbers are %d %d %d", num2, num3, num1);
        else if ( (num2 >= num1 && num2 >= num3) && num1 >= num3 )
            System.out.printf("Sorted numbers are %d %d %d", num3, num1, num2);
        else if ((num2 >= num1 && num2 >= num3) && num3 >= num1)
            System.out.printf("Sorted numbers are %d %d %d", num1, num3, num2);
        else if ( (num3 >= num2 && num3 >= num1) && num2 >= num1 )
            System.out.printf("Sorted numbers are %d %d %d", num1, num2, num3);
        else if ((num3 >= num2 && num3 >= num1) && num1 >= num2)
            System.out.printf("Sorted numbers are %d %d %d", num2, num1, num3);
        input.close();
    }
}
