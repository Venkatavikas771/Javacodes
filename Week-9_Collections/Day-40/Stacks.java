import java.util.*;
class Stacks
  {
    public static void main (String args[])
    {
      Stack<Integer> st=new Stack<Integer>();
      st.push();
      st.push("A");
      st.push(2);
      st.push("B");
     System.out.println(st);
      st.empty();
      st.push(3);
      st.push("C");
      System.out.println(st);
      st.pop();
      System.out.println(st.peek());
      
      System.out.println(st.search("c"));
     System.out.println(st.search(1));
      st.removeAllElements();
      System.out.println(st.empty());
    }
  }