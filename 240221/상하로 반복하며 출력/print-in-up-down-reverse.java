public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j %2 !=0){
                    System.out.print(i);
                } else {
                    System.out.print(n-i +1);
                }
            }
            System.out.println();
        }
    }
}