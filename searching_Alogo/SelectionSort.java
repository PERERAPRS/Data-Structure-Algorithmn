package searching_Alogo;

public class SelectionSort {
    
    public static void main(String arg[]){
         int ar[] = {10,5,7,1,8};
         SelectionSort o =new SelectionSort();
         
          o.selection(ar); System.out.println();
          o.display(ar);
       
    }

    public void selection(int a[]){
        int min ,temp;
      for(int i = 0 ;i<a.length;i++){ 
             min = a[i];
          for(int j = i; j<a.length;j++){      
              if(a[j]<min) {
                  temp = min;
                  min = a[j];
                  a[j]=temp;
                }
            }
            a[i] = min;
        }
    }
   
    public void display(int a[]){
        for (int ar : a) {
            System.out.print(" - "+ar);
        }
    }
}
