public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            if( i %2 == 0){
                System.out.print("*");
            }
            else {
            for(int j=0;j<i+1; j++){
                System.out.print("* ");
            }
            }
            System.out.println();
        }
    }
}