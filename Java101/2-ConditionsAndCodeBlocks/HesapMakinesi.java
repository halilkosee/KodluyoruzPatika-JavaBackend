import java.util.*;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        int val1,val2,op;
        System.out.print("Enter First Number : ");
        val1 = getInput.nextInt();
        System.out.print("Enter Second Number : ");
        val2 = getInput.nextInt();
        System.out.println("Choose Operation\n\tSUM(1)\tSUB(2)\tMULT(3)\tDIV(4)");
        op = getInput.nextInt();
        switch (op){
            case 1:
                System.out.println( val1 + " + " + val2 + " = " + (val1+val2));
                break;
            case 2:
                System.out.println( val1 + " - " + val2 + " = " + (val1-val2));
                break;
            case 3:
                System.out.println( val1 + " * " + val2 + " = " + (val1*val2));
                break;
            case 4:
                if (val2 != 0){
                    System.out.println( val1 + " - " + val2 + " = " + (val1-val2));
                }
                else{
                    System.out.println("Devide with 0 error");
                }
                break;
            default:
                System.out.println("Wrong Operation, Try Again");
        }
        getInput.close();
    }
}
