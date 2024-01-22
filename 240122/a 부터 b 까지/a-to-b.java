public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=a; i<=b;) {
            System.out.print(i + " ");

            if (i %2 != 0) {
                i *=2;
               
            } else if(i %2 == 0) {
                i +=3;
               
            }

        }
    }
}