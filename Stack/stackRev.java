
public class stackRev {
     int[] SatackArray;
     int maxSize;    
     int top;

    public stackRev(int size) {
        maxSize = size;
        SatackArray = new int[maxSize];
        top = -1;
    }
    void push(int val){
        if(isFull()){
            System.out.println("Overflow!!! "+ val);
            return;
        }
        SatackArray[++top] = val;
        System.out.println(val + " Pushed in stack ");
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack is Underflow!!! ");
            return -1;
        }
        return SatackArray[top--];
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Underflow!!! ");
            return -1;
        }
        return SatackArray[top];
    }
    boolean isEmpty(){
        return(top == -1);
    }
    boolean isFull(){
        return(top == maxSize - 1);
    }   
    boolean Print(){
        if (isEmpty()) {
            System.out.println("Stack is Underflow!!! ");
            return true;
        }
        System.out.println("Stack : ");
        for(int i = top; i>= 0; i--){
            System.out.print(SatackArray[i] + " ");
        }
        System.out.println();
        return true;
    }

    public static void main() {
        stackRev obj = new stackRev(7);

        obj.push(10);obj.push(20);obj.push(30);obj.push(40);obj.push(60);obj.push(70);obj.push(80);
        obj.Print();
        System.out.println("Stack POP +> "+ obj.pop());
        System.out.println("Stack After pop :"+ obj.Print());
        System.out.println("Stack PEEK +> "+ obj.peek());
    }
}
