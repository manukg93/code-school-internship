package homework18;



public class TestStack {
    public static void main(String[] args) {
       StackDemo<String>st=new StackDemo<>();

       st.push("A");
       st.push("B");
       st.push("C");
       st.push("D");
       st.push("E");
       st.push("A");
       st.push("A");
       st.push("B");
        st.pop();
        System.out.println(st.search("B"));
        System.out.println(st.empty());
        System.out.println(st.peek());
        System.out.println(st);
    }
}
