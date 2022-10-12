public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> st = new Stack<>();
        // st.push(10);
        // System.out.println(st.top());
        // st.push(20);
        // System.out.println(st.top());
        // st.push(30);
        // System.out.println(st.top());
        // st.pop();
        // System.out.println(st.top());

        // Pushing elements into stack
        for(int i = 1; i <= 10; ++i){
            st.push(i*10);
        }

        System.out.println("Loop to Empty Stack: ");
        while(!st.isEmpty()){
            Integer topVal = st.top();
            st.pop();
            System.out.println(topVal);
        }
    }
}
