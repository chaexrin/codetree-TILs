public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int a = sc.nextInt();
       int b = sc.nextInt();

       if ( a < b) {
        System.out.print(1);
       } else {
        System.out.print(0);
       }

       System.out.print(" ");

       if (a == b) {
        System.out.print(1);
       } else {
        System.out.print(0);
       }
    }
}