public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int m = sc.nextInt();
       
        for(int i=0; i<m; i++){
            int n = sc.nextInt();
             int cnt = 0;
            while(true) {
                    if(n==1){
                 System.out.println(cnt);
                break;
            }
            if(n %2 ==0){
                n /= 2;
                cnt++;
            } else {
                n = 3*n +1;
                cnt++;
            }
        
            }
           
        }

    }
}