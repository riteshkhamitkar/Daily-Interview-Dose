import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ritesh = new Scanner(System.in);
        int number = ritesh.nextInt();
        int digit, sum=0;
        while(number >0){
            digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println("Sum of digits "+sum);
    }
}
