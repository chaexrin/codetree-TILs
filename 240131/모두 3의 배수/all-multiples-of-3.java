public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

            boolean trois = false;

        for(int i=1; i<=5; i++) {
            int n = sc.nextInt();

            if(n %3 == 0) {
            trois = true;
            break;
            }
        }

        if (trois == true)
        System.out.print(1);
        else
         System.out.print(0);
    }
}