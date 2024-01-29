public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

        int cnt = 0;
       while(true) {
        int n = sc.nextInt();
        if (n%2==1) {
                continue;    
            } else {
                System.out.println(n / 2);
            cnt++;
            
            }
            
            if (cnt>=3) {
                break;
            }
       }
    
    }
}