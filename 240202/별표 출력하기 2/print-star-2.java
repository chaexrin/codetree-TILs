public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        for (int i =n; i>=1; i--) {
            for (int j=i; j>=1; j--) {
            System.out.print("* ");
            }
            System.out.println();
        }


    }
}