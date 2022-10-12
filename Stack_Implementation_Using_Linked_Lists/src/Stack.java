public class Stack<T> {
    private Node<T> head;
    private int top;
    public Stack(){
        this.head = null;
        this.top = -1;
    }
    public boolean isEmpty(){
        if(this.top == -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
        top++;
    }
    public void pop(){
        if(this.isEmpty()){
            return;
        }
        Node<T> temp = head;
        this.head = head.next;
        temp.next = null;
        top--;
    }
    public T top(){
        if(this.isEmpty()){
            return null;
        }
        T topVal = this.head.data;
        return topVal;
    }
}
