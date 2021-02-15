package implementation;

import myinterface.StackADT;

import java.util.logging.SocketHandler;

public class MyStack implements StackADT {

    private final int MAX_CAPACITY;

    private int[] arr;

    private int top;

    public MyStack(int MAX_CAPACITY){
        this.MAX_CAPACITY = MAX_CAPACITY;
        arr = new int[MAX_CAPACITY];
        top = -1;
    }

    @Override
    public void push(int element) {
        if(isEmpty()){
            top++;
            arr[top] = element;
            System.out.println("Element added");
        }else {
            System.out.println("Stack Overflow");
        }
    }
/*res=0, if top!=1 ,res=a[top] ,top--, else underflow*/
    @Override
    public int pop() {
        if(top == -1){
            System.out.println("Stack Underflow");
        }else{
            System.out.println("Element deleted" + arr[top]);
            top--;
        }
        return 0;
    }

    @Override
    public int peek() {
        if(top !=-1){
            return arr[top];
        }
        System.out.println("Stack is empty");
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if(top < MAX_CAPACITY - 1){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return top + 1;
    }

    public boolean search(int searchKey){
       boolean res =false;
       for(int i =0;i<=top;i++){
           if(searchKey == arr[i]){
                   res =true;
                   break;
           }
       }
       return res;
    }

    public void traverse(){
        for(int i=0; i<top ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
