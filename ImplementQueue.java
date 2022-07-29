.................
Main.java
.................
public class Main {
    public static void main(String[] args){
        Queue ritesh = new Queue();
        ritesh.push(4);
        ritesh.push(1);
        ritesh.push(2);
        
        int result = ritesh.pop();
        System.out.println(result);

        int result1 = ritesh.pop();
        System.out.println(result1);
        
    }
    
}

..................................
Queue.java
..................................
 import java.util.Stack;

class Queue{
    Stack<Integer> pushS = new Stack<>();
    Stack<Integer> popS = new Stack<>();

    public Queue(){

    }

    public void push(int x){
        pushS.push(x);
        System.out.println("Inserted " + x);

    }
    private void convert(){
        int size = pushS.size();
        for(int i=0;i< size;i++){
            Integer top = pushS.pop();
            popS.push(top);
        }

    }
    public int pop(){
        if(popS.isEmpty()){
            convert();
        }
        return popS.pop();
    }
    public int peek(){
        if(popS.isEmpty()){
            convert();
        }
        return popS.peek();
    }
    public boolean empty(){
        return pushS.isEmpty() && popS.isEmpty();
    }
}
...........
//////finish///////////
