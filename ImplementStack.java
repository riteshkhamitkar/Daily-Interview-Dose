.................
Main.java
.................
public class Main {
    public static void main(String[] args){
        Stack ritesh = new Stack(4);
        ritesh.push(1);
        ritesh.push(2);
         
        int result = ritesh.pop();
        System.out.println(result);

        int result1 = ritesh.pop();
        System.out.println(result1);
    }
}

..................................
Stack.java
..................................
class Stack{
    private int array[];
    private int top;
    private int capacity;

    Stack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
        System.out.println("Pushed" + item);
    }

    public int peek(){
        return array[top];
         

    }

    public int pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
         


    }
}
...........
//////finish///////////
