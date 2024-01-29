public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        for(int i=1; i<= n; i++) {
            n /= i; 
            cnt++;
            if( n /i < 1)
            break;
        }

        System.out.print(cnt);
    }
}