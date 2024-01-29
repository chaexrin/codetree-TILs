public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if (n < 25) {
                System.out.println("Higher");
            } else if (n > 25) {
                System.out.println("Lower");
            } else if (n == 25) {
                System.out.println("Good");
                break;
            }
        }
    }
}