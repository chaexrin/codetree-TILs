public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        if ( n % n ==1){
            System.out.print("N");
        }
        else
        System.out.print("C");
    }
}