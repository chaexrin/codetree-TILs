public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();

        if (a % 13 == 0 || a % 19 == 0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}