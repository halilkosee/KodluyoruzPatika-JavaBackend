import java.util.Scanner;

public class IsPalindrome {
    static boolean isPalindrome(int number){
        int reversedNum = 0,tempNum = number,digit;
        while(tempNum > 0){
            digit = tempNum%10;
            reversedNum = (reversedNum*10) + digit;
            tempNum /= 10; 
        }
        return reversedNum == number;
    }
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int num = getInput.nextInt();
        getInput.close();
        if(isPalindrome(num)){
            System.out.println(num + " Palindrom bir sayıdır.");
        }else{
            System.out.println(num + " Palindrom bir sayı değildir.");
        }
    }
}
