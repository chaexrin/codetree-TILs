public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 80) {
            System.out.println("pass");
        } else {
            System.out.printf("%d more score", 80-n);
        }

    }
}