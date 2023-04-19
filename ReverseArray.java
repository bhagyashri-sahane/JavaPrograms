import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("Enter the length of array");
       int length = scanner.nextInt();
       int[] array=new int[length];

       System.out.println("Enter the array element");
       for(int i=0;i<length;i++){
        array[i]=scanner.nextInt();
        
       }
       for(int i=length-1;i>=0;i--){
       System.out.print( array[i] + " ");
       }
    }
}
