public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int n = sc.nextInt();

       boolean satisfied = true;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                satisfied = false;
            }
        }
        if(satisfied == true){
            System.out.print("P");
        }
        else{
            System.out.print("C");
    }
}
}