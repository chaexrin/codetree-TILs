public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        int i = b;

        
        while ( i >= a) {
            System.out.print(i+ " ");
            i -= 2;
        } 
    }
}