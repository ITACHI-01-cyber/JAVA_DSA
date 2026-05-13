
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

// public class Stack01 {
//     void main(){
//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);
//         System.out.println(st);
//         System.out.println(st.pop());
//         System.out.println(st);
//         System.out.println(st.peek());
//     }
// }

// STACK BASIC IMPLENETATION
public class Stack01 {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack01(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize top to -1 to indicate an empty stack
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // Return a sentinel value
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Return a sentinel value
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack01 stack = new Stack01(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.printStack();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.printStack();
    }
}
