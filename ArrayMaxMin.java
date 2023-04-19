import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       
       int max,min;
       System.out.println("Enter the length of array");
       int length = scanner.nextInt();
       int[] array=new int[length];

       System.out.println("Enter the array element");
       for(int i=0;i<length;i++){
        array[i]=scanner.nextInt();

       }
       max=min=array[0];
       for(int i=0;i<length;i++){
        if(array[i]>max){
            max=array[i];
        }else if(array[i]<min){
            min=array[i];
        }
       }
       System.out.println("Maximum number : "+ max);
       System.out.println("Minimum number : "+ min);
    }
    
}
