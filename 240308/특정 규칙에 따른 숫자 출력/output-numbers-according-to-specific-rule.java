public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        int cnt =1;
        
        for (int i=0; i<n; i++) {
             for(int j=0; j<2*i; j++) {
                System.out.print( " ");
            }
            for (int j=i+1; j<=n; j++) {
                System.out.print(cnt + " ");
                cnt++;
                if(cnt>9){
                    cnt=1;
                }
            }  
            System.out.println();
        }
    }
}