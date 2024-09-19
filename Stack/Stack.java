package Stack;
public class Stack {
  
        int maxSize;
        int top;
        String []stackArray;//int
      
        Stack(int size){
           maxSize = size;
           stackArray = new String[maxSize];///int
           top=-1;
        }
        public static void main(String []args){
            Stack ob = new Stack(7);
            ob.pop();
            System.out.println("-------------------");
            ob.push("S");
            ob.push("A");
            ob.push("S");
            ob.push("I");
            ob.push("D");
            ob.push("U");
        
        
            System.out.println("-------------------");
            System.out.println("Top element is:"+ob.peek());
            System.out.println("-------------------");
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
            ob.pop();
        
               
            System.out.println("Top element is:"+ob.peek());
            System.out.println(ob.isFull());
            System.out.println(ob.isEmpty());
        }
        
        void push(String inputElement){//int
          if(isFull()){
              System.out.println("Stack is full");
          }
          else{
              top = top+1;
              stackArray[top] = inputElement;
              System.out.println("pushed element is :"+inputElement);
          }
      
        }
      
       String pop(){
          if(isEmpty()){
              System.out.println("Stack is empty");
              return null;
          }
          else{
              int returnedTop = top;
              top--;
              System.out.println("poped element is:"+stackArray[returnedTop]);
              return stackArray[returnedTop];
          }
       }
       String peek(){
          if(!isEmpty()){
              return stackArray[top];
          }
          else{
              return null;
          }
      
       }
        boolean isFull(){
          if(top == maxSize-1){
              return true;
          }
          else
              return false;//-1
        }
      
      boolean isEmpty(){
          if(top==-1){
               return true;
          }
          else
             return false;
      }   
    }

