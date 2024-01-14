public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int y = sc.nextInt();

        if((y %4== 0 && y%100 != 0) || y %400 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}