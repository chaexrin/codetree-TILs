public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
      

       for(int i = 1; i <= n; i++) {
        if(i %2 !=0 && i%10 !=5 && i %3 !=0 && i %9 ==0)
        System.out.print(i + " ");
        continue;
       }
    }
}