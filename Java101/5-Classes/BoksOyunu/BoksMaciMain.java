public class BoksMaciMain {
    public static void main(String[] args) {
      Fighter marc = new Fighter("Halil" , 15 , 100, 90, 20);
      Fighter alex = new Fighter("Yusuf" , 10 , 95, 100, 30);
      Ring r = new Ring(marc,alex , 90 , 100);
      r.run();
    }
  }