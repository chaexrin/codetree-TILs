public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();

        a = a == 100 ? 0 : 1 ;

        if (a == 0) {
            System.out.println("pass");
        } else {
            System.out.println("failure");
        }

    }
}