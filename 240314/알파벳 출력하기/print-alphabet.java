public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        int x = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)x);
                x++;
                if((char)x == 'Z'){
                    x = 'A';
                }
            }
            System.out.println();
        }
    }
}