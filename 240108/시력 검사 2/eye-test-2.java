public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        float a = sc.nextFloat();

        if (a >= 1.0) {
            System.out.println("High");
        } else if ( a >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}