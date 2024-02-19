public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        
        
        for(int i=0; i<n; i++){
            while (cnt <10){
            for (int j=0; j<n; j++){
                 
                System.out.print(cnt);
                cnt++;
                if(cnt == 10){
                    cnt = 1;
                }
            }
            }
                System.out.println();
            }
            
        
    }
    }