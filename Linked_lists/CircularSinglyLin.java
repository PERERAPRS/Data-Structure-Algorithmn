public class CircularSinglyLin {
    public class Node{
        int data;
        Node next;
        public Node(int data){
             this.data = data;
             this.next = null;
        }
    }
    Node head;
    Node tail;
    public static void main(String []rs){
      CircularSinglyLin o = new CircularSinglyLin();
      o.insertFro(1);
      o.insertFro(2);
      o.insertFro(3);
      o.insertFro(4);
      o.insertFro(5);
      o.insertFro(6);
      o.dispal();System.out.println();
      o.insertEn(10);
      o.dispal();System.out.println();
      System.out.println("Deleted : "+o.delFront());
      o.dispal();System.out.println();
      System.out.println("Deleted : "+o.delEn());
      o.dispal();System.out.println();

    }

    public void insertFro(int value){
        Node newnode = new Node(value);  
        if(head == null){
            head = newnode;
            tail = newnode;
          }
        else{
            newnode.next = head;
            head = newnode;
            tail.next=head;
        }
    }
    public int delFront(){
        int x = -1;
        if(head == null){
            System.out.println("Empty list");
            return x;
        }
        else{
            x = head.data;
            head = head.next; 
            tail.next=head;
        }
        return x;
    }

    public void insertEn(int value){
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
        int x = -1;
        if(head == null){
            System.out.println("Empty list");
            return x;
        }
        else{
            if(head != tail){
               Node tem = tail;
               while (tem.next != tail){
                tem = tem.next;
              } 
                x = tail.data;
                tail = tem;
                tail.next = head;
            }
            else{
                tail = null;head=null;
            }
            //tail.next = head;
        }
        return x;
    }
    public void dispal(){
        if(head == null){
                System.out.println("Empty list");
        }        
        Node tem = head;
        do{
         System.out.print(" | "+tem.data);
         tem = tem.next;
        }while(tem != head);
    }

}
