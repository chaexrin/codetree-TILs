public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i=1; i<=10; i++) {
        int n = sc.nextInt();
        if (n %3 ==0) {
            cnt1++;
        } 
        if (n %5 ==0) {
            cnt2++;
        }
        }

        System.out.printf("%d %d", cnt1, cnt2);
        
    }
}