public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a %2 == 1 && b % 2 == 1) {
            for (int i = a; i <= b; i += 2) {
                System.out.print(i+ " ");
            }
        }
    }
}