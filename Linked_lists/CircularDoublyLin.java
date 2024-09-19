public class CircularDoublyLin {
    public class Node{
        int value;
        Node next;
        Node previous;
        public Node(int value){
             this.value = value;
             this.next = null;
             this.previous = null;
        }
    }
    int size;
    Node head,tail;

   public static void main (String []arg){
    CircularDoublyLin ob = new CircularDoublyLin();
       ob.insertFro(2);
       ob.insertFro(4);
       ob.insertFro(6);
       ob.insertFro(8);
       ob.insertFro(10);
       System.out.print("Current Nodes--->");ob.display();System.out.println();
       System.out.print("Insert Front 12 --->");ob.insertFro(12);ob.display();System.out.println();
       System.out.print("           & 14 --->");ob.insertFro(14);ob.display();System.out.println();
       System.out.print("After Delete Front |"+ob.deleteFro()+"| --->");ob.display();System.out.println();
       System.out.print("\nAfter ist end");
       ob.insEn(25); ob.insEn(30);
       ob.display(); System.out.print("\nAfter del end "+ob.delEn()+" "+ob.delEn()+"\n");
       ob.display();

   }
   public void insertFro(int value){
      Node newnode = new Node(value);  
      if(head == null){
              head = newnode;
              tail = newnode;
        }
      else{
         newnode.next = head;
         head.previous = newnode;
         head = newnode;
         newnode.previous = tail;
         tail.next = newnode;
      }
      size++;

    }
    public int deleteFro(){
        int deleted = -1;
        if(head == null){
           System.out.println("Empty !.");
           return deleted;
        }
           else{
            deleted = head.value;    
            head = head.next;
            head.previous = tail;
            tail.next = head;
        }
        size--;
        return deleted;
    }

    public void display(){
        Node temp = head;
        if(head == null)System.out.println("-Empty list-");
        else{
          do{
            System.out.print(" | "+temp.value);
            temp = temp.next;
            }while(temp != head);
        }
    
        System.out.print(" | ");
       
    }
    public void insEn(int value){
       Node newnode = new Node(value);
       if(head == null){
           head = newnode;
           tail = newnode;
       }
       else{
           tail.next = newnode;
           tail = newnode;
           tail.next = head;
       }
    }
    public int delEn(){
        int x =-1;
        if(head == null){
            System.out.println("Emty list");
            return -1;
        }
        else{
            if(head != tail){
                  Node tem = head;
                  while(tem.next != tail){
                     tem = tem.next;
                  }
                  x = tail.value;
                  tail = tem;
                  tem.next = head; 
            }
            else{
                head = tail =null;
            }
            return x;
        }
    }
    public void display1(){
        System.out.println("*****************************");
        System.out.println("tail : "+tail.value);
        System.out.println("head : "+head.value);
    }

}
