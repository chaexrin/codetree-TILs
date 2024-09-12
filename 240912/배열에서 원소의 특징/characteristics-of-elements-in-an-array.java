public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);

       int [] arr = new int[10];

       for(int i=0; i<10; i++) {
         arr[i] = sc.nextInt();
         if(arr[i] %3 ==0){
            System.out.print(arr[i-1]);
            break;
         }
       }
    }
}