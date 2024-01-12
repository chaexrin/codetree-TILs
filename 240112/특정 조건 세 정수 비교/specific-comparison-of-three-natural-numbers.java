public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a == Math.min(a,b) && a == Math.min(b,c) && a == Math.min(a,c))
        System.out.print("1 ");
        else 
         System.out.print("0 ");
         if (a == b && a == c && b == c)
         System.out.print("1 ");
        else 
         System.out.print("0 ");
    }
}