public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
    

       for(int i=0; i<n; i++) {
          int a = sc.nextInt();
          int b = sc.nextInt();

         int sum =1;
          for(int j=a; j<=b; j++){
            sum *= j;
          }
          System.out.println(sum);
       }
    }
}