public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int cnt = 0;

       for (int i=0; i<10; i++) {
        int n = sc.nextInt();
        if (n %2 != 0) {
            cnt++;
        }
       }
       System.out.print(cnt);
    }
}