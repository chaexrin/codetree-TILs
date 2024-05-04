public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];
        double avg = 0;

        for(int i=0; i< n; i++) {
            arr[i] = sc.nextDouble();
            avg += arr[i];
        } 
       
        System.out.printf("%.1f\n", avg/n);
        if (avg/n >= 4.0){
            System.out.println("Perfect");
        } else if (avg/n >= 3.0){
             System.out.println("Good");
        } else{
            System.out.println("Poor");
        }
    }
}