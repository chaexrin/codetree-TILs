public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
       
       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
       }

       for(int i=1; i<=n; i++){
        for(int j=n-1; j>=i; j--){
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
       }
    }
}