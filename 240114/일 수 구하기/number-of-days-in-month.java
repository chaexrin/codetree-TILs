public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 ==0) {
            if ( n == 2) {
                System.out.println("28");
            } else if (n == 8 || n ==10 || n ==12){
                System.out.println("31");
            } else {
                System.out.println("30");
            }
        } else {
            if( n == 9 || n == 11){
            System.out.println("30");
            } else {
            System.out.println("31");
            }
        }
    }
}