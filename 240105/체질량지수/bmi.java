public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        double BMI = b*(Math.pow(100,2))/(Math.pow(a,2));
        System.out.println((int)BMI);

        if ((int)BMI >= 25) {
            System.out.println("Obesity");
        }
    }
}