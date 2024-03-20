public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int start = sc.nextInt();
       int end = sc.nextInt();
        int cnt = 0;
       for(int i=start; i<=end; i++){
        int sum =0;
            for(int j=1; j<=i; j++){
                if(i % j== 0){
                    sum++;
                }
            }
            if(sum == 3){
                cnt++;
            }
       }
       System.out.print(cnt);

    }
}