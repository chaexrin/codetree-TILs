public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int a = sc.nextInt();

       for (int i =1; i <= a; i++) {
        if (i %2 ==0 && i %4 !=0)
        continue;
        if ((i/8) %2 ==0)
        continue;
        if ((i%7) <4)
        continue;
        System.out.print(i + " ");
       }
    }
}