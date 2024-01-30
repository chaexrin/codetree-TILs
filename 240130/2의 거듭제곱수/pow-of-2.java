public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
       int x = 1;
        int cnt = 0;

       while (true) {
       
        
        if (n == x){
        break;
        }
        x *= 2;
 cnt++;
        
       
       }
 System.out.print(cnt);
       
    }

}