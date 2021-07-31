import java.util.*;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        String userName, password;
        char ch;
        System.out.print("UserName : ");
        userName = getInput.nextLine();
        System.out.print("Password : ");
        password = getInput.nextLine();
        if (userName.equals("halil") && password.equals("1234")){
            System.out.println("Correct...You are in.");
        }
        else if(!userName.equals("halil") || !password.equals("1234")){
            System.out.println("Wrong username or password...");
            System.out.println("Do You Want To Change Your Password Yes(y) or No(n)");
            ch = getInput.next().charAt(0);
            switch (ch){
                case 'y':
                    System.out.println("Enter New Password : ");
                    Scanner getInput2 = new Scanner(System.in);
                    String newpassword = getInput2.nextLine();
                    if (newpassword == "1234"){
                        System.out.println("Try different password");
                    }else{
                        System.out.println("New Password Created");
                    }
                    break;
                case 'n':
                    System.out.println("GoodBy...");
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
        getInput.close();
    }
}
