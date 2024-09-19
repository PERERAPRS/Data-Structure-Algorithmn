public class DoublyLinkedList {
    public class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
           this.value = value;
           this.next = null;
           this.prev = null;
        }

        
    }
    Node head = null;
    Node tail = null;
    int size = 0; 

    public static void main(String []args){
        DoublyLinkedList o = new DoublyLinkedList();
        o.insertfront(10);
        o.insertfront(15);
        o.insertfront(12);
        o.display();
        o.insertlast(20);
        System.out.println();
        o.display();
        o.insertBefore(24, 15);System.out.println();
        o.display();System.out.println();           
        System.out.println(o.deleteBefore(10));
        o.display();System.out.println();
        System.out.println( o.DeleteLast());
        o.display();
       
    }
    
    public void insertfront(int value){
        Node newnod = new Node(value);
        size++;  
        if(head == null){
            head = newnod;
            tail = newnod;
            newnod.next = null;
            newnod.prev = null;
          }
        else{
            head.prev = newnod;
            newnod.next = head;
            head = newnod;
            newnod.prev = null;
        } 
    }
    public int deleteFirst(){
        int v = 0;
        if(head == null){
            System.out.print("Empty!");
            return -1;
        }
        else{
          v = head.value; 
          head = head.next;
          head.prev = null;
        }
        return v;
    }

    public void insertlast(int value){
        Node newnode = new Node(value);
        size++;
        if(tail == null){
            tail = newnode;
            head = newnode;
            head.next = null;
            head.prev = null;
        }
        else{
            newnode.prev = tail;
            tail = newnode;
            newnode.next = null;
            }
        }
    public int DeleteLast(){
        System.out.println("tail is : "+tail.value);
        int v = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return v;
    }
    public void insertBefore(int value,int before){
        Node newnode = new Node(value);
        Node tm = head,cur = null;
        while(tm.value != before){
            cur = tm;
            tm = tm.next;
        }
       cur.next = newnode;
       newnode.prev = cur;
       newnode.next = tm;
       tm.prev = newnode;
    }
    public int deleteBefore(int before){
         Node pre = null,cur = null,tm = head;
         while (tm.value != before) {
            pre = cur;
            cur = tm;
            tm = tm.next;
         }
         int v = cur.value;
         pre.next = tm;
         tm.prev = pre;
         size--;
         return v;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" <- ");
            temp = temp.next;
        }
        
    }
}
