public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 1;

        for(int i=1; i<=b; i++) {
            if(i %a ==0){
                n *=i;
            }
        }

        System.out.print(n);
    }
    
}