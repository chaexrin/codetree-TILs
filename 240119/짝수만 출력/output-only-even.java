public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        while (i <= b){
            System.out.print(i+" ");
            i += 2;
        }
    }
}