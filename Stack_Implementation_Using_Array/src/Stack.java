import java.util.ArrayList;
public class Stack<T>{
    private ArrayList<T> arr;
    private int top;
    
    public Stack(){
        this.arr = new ArrayList<>();
        this.top = -1;
    }

    public boolean isEmpty(){
        if(this.top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(T val){
        this.top++;
        this.arr.add(val);
        return;
    }

    public void pop(){
        if(this.isEmpty()){
            return;
        }
        else{
            this.arr.remove(this.top);
            this.top--;
        }
        return;
    }

    public T top(){
        T data = this.arr.get(this.top);
        return data;
    }
}