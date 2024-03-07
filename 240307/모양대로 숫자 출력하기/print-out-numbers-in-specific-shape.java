public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();


        for (int i=0; i<n; i++) {
             for(int j=0; j<2*i; j++) {
                System.out.print( " ");
            }
            for (int j=n; j>i; j--) {
                System.out.print(j-i + " ");
            }  
            System.out.println();
        }
    }
}