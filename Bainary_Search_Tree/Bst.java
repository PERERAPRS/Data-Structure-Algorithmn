package Bainary_Search_Tree;

public class Bst {
    public class Node{
        int data;
        Node right,left;

        public Node(int data){
             this.data = data;
             this.right = null;
             this.left = null;
        }
    }
    Node root = null;
    public static void main(String []arg){
         Bst o =new Bst();
         o.root=o.insert(o.root, 5);
         o.root=o.insert(o.root, 10);
         o.root=o.insert(o.root, 9);
         o.root=o.insert(o.root, 15);
         o.root=o.insert(o.root, 0);
         o.root=o.insert(o.root, 1);
         System.out.print("Tree pre-order  ");
         o.preorder(o.root); System.out.println();
         System.out.print("Tree in-order  ");
         o.inorder(o.root); System.out.println();
         System.out.print("Tree post-order  ");
         o.postorder(o.root); System.out.println();

         o.root=o.delete(o.root, 1);
         System.out.println("\n\ndelete 1 ");
         o.preorder(o.root);
         o.root=o.delete(o.root, 10);
         System.out.println("\ndelete 10 ");
         o.preorder(o.root);
    }
    Node createnewNode(int value){
         Node n = new Node(value);
         n.data = value;
         n.left = null;
         n.right = null;
         return n;
    }
    Node insert(Node newnod,int value){
         if(newnod == null) return createnewNode(value);     
         if(newnod.data < value ) newnod.right = insert(newnod.right, value);
         else if (newnod.data > value) newnod.left = insert(newnod.left, value);
         return newnod;
    }
    Node delete(Node node,int value){
       if(node == null) return null;
       if(value<node.data)
            node.left = delete(node.left, value);
       else if(value>node.data)
            node.right = delete(node.right, value);
       else{
            if(node.left == null || node.right == null){
                Node tmp = null;
                tmp = node.left == null ? node.right : node.left;

                if(tmp != null)return tmp;
                else return null;
            }
            else{
              
               Node successor = getsuccessor(node);
               node.data = successor.data;
               node.right = delete(node.right, successor.data);
               return node;
            }
       }
       return node;
       
    }
    Node getsuccessor(Node node) {
     if (node == null || node.right == null) return null;
     
     Node tmp = node.right;
     while (tmp.left != null) {
         tmp = tmp.left;
     }
     return tmp;
 }
 

 void preorder(Node node){
     if(node == null)return;
      
     System.out.print(" /"+node.data);
     preorder(node.left);  
     preorder(node.right);
      }
      void inorder(Node node){
          if(node == null)return;
     
          preorder(node.left);   
          System.out.print(" /"+node.data);
          preorder(node.right);
       }
       void postorder(Node node){
          if(node == null)return;
     
          postorder(node.left); 
          postorder(node.right);  
          System.out.print(" /"+node.data);
          
       }
}
