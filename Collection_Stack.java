import java.util.Stack;

public class Collection_Stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Lion");
        st.push("Tiger");
        st.push("Tui");
        st.push("Elephant");
        st.pop();
        System.out.println(st.peek());
    }
    
}
