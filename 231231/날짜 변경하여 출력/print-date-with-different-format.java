public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        sc.useDelimiter("\\.");
        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();

        System.out.println(mm + "-" + dd + "-" + yyyy);
    }
}