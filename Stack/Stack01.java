import java.util.*;

// IMPLENTATION STAION ====================================================>>>>>>>>>>>>>>>>

// class CustomStack {
//     int[] arr;
//     int top;
//     int size;

//     CustomStack(int size){
//         this.size = size;
//         arr = new int[size];
//         top = -1;
//     }

//     void push(int val) {
//         if (top == size - 1) {
//             System.out.println("Stack Overflow!");
//             return;
//         }
//         arr[++top] = val;
//         System.out.println(val + " pushed");
//     }

//     int pop() {
//         if (top == -1) {
//             System.out.println("Stack Underflow!");
//             return -1;
//         }
//         return arr[top--];
//     }

//     int peek() {
//         if (top == -1) {
//             System.out.println("Stack is Empty!");
//             return -1;
//         }
//         return arr[top];
//     }

//     boolean isEmpty() {
//         return top == -1;
//     }

//     void print() {
//         for (int i = top; i >= 0; i--) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }

// public class Stack01 {
//     public static void main(String[] args){
//         CustomStack s = new CustomStack(5);

//         s.push(10);
//         s.push(20);
//         s.push(30);

//         System.out.print("Stack: ");
//         s.print();

//         System.out.println("Top: " + s.peek());
//         System.out.println("Pop: " + s.pop());

//         System.out.print("After Pop: ");
//         s.print();
//     }
// }

// STACK IMPLEMENTATION USING JCF ==================================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

public class Stack01 {
    void main(){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
    }
}