public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        for(int i=2; i<=n; i++){
            if(i % i ==0 && i / 1 ==i){
                System.out.print(i+" ");
            }
        }
    }
}