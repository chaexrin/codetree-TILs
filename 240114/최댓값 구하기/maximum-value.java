public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a>= b && a >= c)
        System.out.println(a);
        else if ( b >= a && b >= c)
        System.out.println(b);
        else
        System.out.println(c);
    }
}