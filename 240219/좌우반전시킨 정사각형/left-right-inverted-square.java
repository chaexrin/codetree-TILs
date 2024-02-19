public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();

       for(int i=1; i<=n; i++){
        for(int j=n; j>0; j--){
            System.out.print(j*i + " ");
        }
        System.out.println();
       }
    }
}