public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.println((a+b+c)/3);
        System.out.println((a+b+c) -((a+b+c)/3));
    }
}