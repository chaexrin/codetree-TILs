public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i=n; i <=100; i++) {
            sum += i;
        }

        System.out.print(sum);
    }
}