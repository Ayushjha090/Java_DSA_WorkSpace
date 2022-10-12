public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> st = new Stack<>();
        // pushing elements to stack
        for(int i = 0; i <= 10; ++i){
            st.push(i*100);
        }
        // printing stack elements
        while(!st.isEmpty()){
            Integer topVal = st.top();
            st.pop();
            System.out.println(topVal);
        }
    }
}
