public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        char c = sc.next().charAt(0);
        int n = sc.nextInt();
       

        if (c =='A') {
            for (int i=1; i<=n; i++) {
                System.out.print(i + " ");
            }
            
        }
        else {
            for (int i=n; i>=1; i--) {
                System.out.print(i + " ");
            }
        }
    }
}