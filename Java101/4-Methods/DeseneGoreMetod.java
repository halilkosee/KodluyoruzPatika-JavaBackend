public class DeseneGoreMetod {
    static int func(int num, int stop){
        if(stop == 0){
            return 1;
        }
         System.out.print(num + " ");
        if(num <= 0 && stop > 0){
            stop *= -1;
            return func(num+5,stop+1);
        }
        else if(stop < 0){
            return func(num+5,stop+1);
        }
        
        return func(num -5,stop+1);
    }
    public static void main(String[] args) {
      func(16,1);
      System.out.println("\n");
      func(10,1);
      System.out.println("\n");
      func(25,1);
      System.out.println("\n");
      func(5,1);
    }
}
