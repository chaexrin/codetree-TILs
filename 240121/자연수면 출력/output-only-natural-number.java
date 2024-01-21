public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a > 0) {
            for (int i =1 ; i<= b; i++) {
                System.out.print(a);
            }
        }
        else {
            System.out.print("0");
        }
    }
}