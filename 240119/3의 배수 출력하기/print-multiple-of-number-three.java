public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
        int i = 3;

       while (i <= n) {
        System.out.print(i + " ");
        i += 3;
       }
    }
}