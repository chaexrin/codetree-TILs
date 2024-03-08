public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();

       for(int i=n; i>0; i--){
        for(int j=i; j<=n; j++){
            System.out.print(j + " ");
        }
        System.out.println();
       }

    }
}