public class HarmonikOrtalama {
    
    static double harmonic(int arr[]){
       double sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i]/(i+1);
        }
        return (double)(arr.length/(double)sum);
    }
    
    public static void main(String[] args) {
        ///////////////////////////////////////////////
        int[] arr = new int[10];
        int random;
        for (int i = 0; i<arr.length; i++) {
          random = (int) (Math.random()*100); //fill array with random integer numbers
          arr[i] = random;
        } 
        //////////////////////////////////////////////
        System.out.println("Harmonik Ortalama : " + harmonic(arr));

    }
}
