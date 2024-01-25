public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if(i %6 ==0 && i %8 != 0){
                sum +=i;
            }
        }

        System.out.print(sum);
    }
}