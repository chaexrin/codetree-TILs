public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(a > b ? 1:0);
        System.out.println(a > c ? 1:0);
        System.out.println(a > d ? 1:0);
        System.out.println(a > e ? 1:0);
    }
}