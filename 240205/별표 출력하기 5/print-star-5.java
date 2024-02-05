public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        
        for (int i=n; i>=1; i--){
               for(int j=1; j<= i; j++){
                for (int k=1; k<=i; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
               }
               System.out.println();
        }

       
    }
}