public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();

       for(int i=0; i<n; i++){
        for(int j=0; j<n - 1 - i; j++){
            System.out.print("  ");
        }
        for(int k=0; k<i+1; k++){
            System.out.print("@ ");
        }
        System.out.println();
       }

         for(int i=0; i<n; i++){
        for(int j=0; j<n - 1 - i; j++){
            System.out.print("@ ");
        }
        for(int k=0; k<i+1; k++){
            System.out.print("  ");
        }
        System.out.println();
       }
    }
}