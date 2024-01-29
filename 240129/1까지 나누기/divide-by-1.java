public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
         
        int cnt = 0;
        
        for(int i=1; i <= 100; i++) {
            n /= i;
            cnt++;
            if( n <= 1) {
            System.out.print(cnt);
            break;
            }
        }

        
    }
}