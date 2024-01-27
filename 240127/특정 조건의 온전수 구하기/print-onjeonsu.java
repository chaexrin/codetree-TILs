public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();
      

       for(int i = 1; i <= n; i++) {
        if(i % 2 == 0)
                continue;
            if(i % 10 == 5)
                continue;
            if(i % 3 == 0 && i % 9 != 0)
                continue;
            System.out.print(i + " ");
       }



    }
}