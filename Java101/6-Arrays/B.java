public class B {
    public static void main(String[] args) {
        
        for(int i = 0; i<=20; i++){
            for(int j = 0; j<=20; j++){
                if(i == 0 || i == 20 || i == 10 || j==0 || j == 20){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
