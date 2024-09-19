package searching_Alogo;

public class MergSort {
    public static void main(String []atg){
        int ar[] = {2,3,0,1,5,7,9};
        MergSort a = new MergSort();
        System.out.println("Original  ");
        a.display(ar);
        a.mergsort(ar);
        System.out.println("\nSorted  ");
        a.display(ar);
      }
    public void mergsort(int a[]){
      if(a.length>1){
      int mid = a.length/2;
      int L[] = new int[mid];  
      int R[] = new int[a.length-mid];  
      for(int i = 0;i<L.length;i++){
         L[i] = a[i];
      }
     
      for(int i = mid; i<a.length;i++){
        R[i-mid] = a[i];
    }    
       mergsort(L);
       mergsort(R);
       
       merge(a,L,R);
    }
    
    }
    public void merge(int a[],int l[],int r[]){
        
        int i = 0,j = 0, k = 0;
        while(i<l.length && j<r.length){
           if(l[i]<=r[j]){
             a[k] = l[i];
             i++;
           }
           else{
             a[k] = r[j];
             j++;
           }
           k++;
      }
      while (i < l.length) {
        a[k] = l[i];
        i++;
        k++;
    }
    while (j < r.length) {
        a[k] = r[j];
        j++;
        k++;
     }
     
    }
    public void display(int a[]){
        for (int ar : a) {
            System.out.print(" - "+ar);
        }
    }

    
}
