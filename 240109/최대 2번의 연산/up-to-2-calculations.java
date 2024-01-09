public class Main {
    public static void main(String[] args) {
      java.util.Scanner sc = new java.util.Scanner(System.in);

      int a = sc.nextInt();

      if ( a % 2 == 0){
      a /= 2;
        if ( a % 2 != 0)
        a = (a+1)/2;
        }
        System.out.println((int)a);
    }
}