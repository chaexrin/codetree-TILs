public class Main {
    public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);

      int n =sc.nextInt();

      if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 ==0))
      System.out.println("true");
      else 
      System.out.println("false");
    }
}