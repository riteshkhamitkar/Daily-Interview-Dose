public class Main {
   public static void main(String args[]) {
      String ritesh = "anna";
      StringBuffer buffer = new StringBuffer(ritesh);
      buffer.reverse();
      String rohan = buffer.toString();
      if(ritesh.equals(rohan)){
         System.out.println("Given String is palindrome");
      } else {
         System.out.println("Given String is not palindrome");
      }
   }
}
