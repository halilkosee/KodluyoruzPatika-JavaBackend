public class AsalSayilar {
    public static void main(String[] args) {
        for(int i = 2; i<100; i++){
            if(i == 2){
                System.out.print(i + " ");
                continue;
            }
            for(int j = 2; j<i; j++){
               if( i%j == 0){
                   break;
               }else if(j==i-1){
                System.out.print(i + " ");
                    break;
               }
            }      
        }
    }
}
