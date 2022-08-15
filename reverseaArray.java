import java.util.*;
public class Main{
     
        public void reverse(int arr[]){
            for(int i =0; i < arr.length/2;i++){
                int j = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1]=j;
            }
        }
        
        public static void main(String[] args){
           Main ritesh = new Main();
            int arr[] = {1,2,3,4,5,6,7,8,9};
            ritesh.reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
}
