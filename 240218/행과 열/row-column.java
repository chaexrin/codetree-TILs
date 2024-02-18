public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a;i++){
            for(int j=1; j<=b; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
    }
}