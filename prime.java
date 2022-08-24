import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ritesh = new Scanner(System.in);
        int num = ritesh.nextInt();
        boolean flag = false;
        for(int i =2; i < num/2;i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(num+" is Prime Number");
            
        }else{
            System.out.println(num+" is not Prime Number");
        }
    }
}
