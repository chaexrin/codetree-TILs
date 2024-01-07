public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();

       System.out.println((int)Math.pow(n,2));
       if (n < 5) {
        System.out.println("tiny");
       }
    }
}