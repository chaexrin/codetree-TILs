public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       char[] arr = new char[10];

       for(int i=0; i<10; i++){
        arr[i] = sc.next().charAt(0);
       }

        for(int i=9; i>=0; i--){
        System.out.print(arr[i]);
       }
       
    }
}