public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a += 8;
        b *= 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
    }
}