public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        double num =n;
        int cnt = 0;
        for(int i=1; i<= n; i++) {
            num /= (double)i;
            cnt++;
            if( num <= 1)
            break;
        }

        System.out.print(cnt);
    }
}