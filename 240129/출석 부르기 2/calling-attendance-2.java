public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        for (int i=1; i<= 100; i++) {
            int n = sc.nextInt();
            if (n ==1) {
                System.out.println("John");
            } else if (n ==2) {
                System.out.println("Tom");
            } else if (n ==3) {
                System.out.println("Paul");
            } else if (n ==4) {
                System.out.println("Sam");
            } else {
                System.out.println("Vacancy");
                break;
            }
        }
    }
}