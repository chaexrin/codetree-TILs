public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, cnt = 0;
        double avg;

        for(int i=1; i<=n; i++){
            int a = sc.nextInt();
            sum += a;
            cnt++;
        }
        avg = (double)sum/cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}