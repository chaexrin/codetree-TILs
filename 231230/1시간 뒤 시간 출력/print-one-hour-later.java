public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        sc.useDelimiter(":");

        int h = sc.nextInt();
        int m = sc.nextInt();

        System.out.printf("%d:%d",h+1,m);
    }
}