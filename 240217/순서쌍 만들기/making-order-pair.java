public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();

       for(int i=n; i>0; i--){
        for(int j=n; j>0; j--){
            System.out.printf("(%d,%d) ", i, j);
        }
        System.out.println();
       }
    }
}