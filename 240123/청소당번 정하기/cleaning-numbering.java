public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int cls = 0, cor = 0, rest = 0;

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            
            if(i %12 ==0){
                rest++;
            } else if(i %3 ==0) {
                cor++;
            } else if(i %2 ==0) {
                cls++;
            }

            

        }

        System.out.printf("%d %d %d", cls, cor,rest);
    }
}