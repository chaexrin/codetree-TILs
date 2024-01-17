public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i= b; i>=a; i--)
        System.out.print(i+ " ");
    }
}