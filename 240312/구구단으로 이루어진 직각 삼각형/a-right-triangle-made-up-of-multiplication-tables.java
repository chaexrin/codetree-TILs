public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j =1; j<=n-i+1;j++) {
                if(j == n-i+1){
                    System.out.print(i+ " * "+ j+ " = " + (i*j));
                }
                System.out.print(i+ " * "+ j+ " = " + (i*j)+ " / ");
            }
            System.out.println();
        }
    }
}