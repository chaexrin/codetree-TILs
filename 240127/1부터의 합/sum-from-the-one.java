public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int ans = -1;

        for (int i=1; i<=100; i++) {
            sum += i;
            if(sum >= n) {
            ans = i;
            break;
            }
        }
         System.out.print(ans);
      
    }
}