public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
       int sum = 0;
       
       for(int i=1; i <= n; i++) {
        int a = sc.nextInt();
        if (a %2 !=0 && a %3 ==0) {
            sum +=a;
        }
       }

       System.out.print(sum);
    }
}