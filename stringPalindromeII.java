public class Main{
    public static void main(String[] args){
    String ritesh = "nayan";
    String reversed ="";
    for(int i = ritesh.length()-1;i>=0;i--){
        reversed = reversed + ritesh.charAt(i);
    }
    if(ritesh.equals(reversed)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
    }
}
