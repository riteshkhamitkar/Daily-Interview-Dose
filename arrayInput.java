import java.util.*;
public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements:");
        n = sc.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
