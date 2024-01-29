public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
         int sum = 0;
        int cnt = 1;
        for(int i=1; i <= n; i++) {
            n /= i;
            cnt++;
            sum = n/i;
            
            if( sum < 1) {
           System.out.print(cnt);
            
            break;
            }
        }

        
    }
}