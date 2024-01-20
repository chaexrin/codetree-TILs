public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int a = sc.nextInt();
       int n = sc.nextInt();

       for(int i=1; i <= n; i++) {
        System.out.println(a+=n);
       }
    }
}