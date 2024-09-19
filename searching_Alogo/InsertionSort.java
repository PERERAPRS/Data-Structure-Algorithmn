package searching_Alogo;
public class InsertionSort {
    public static void main(String []atg){
      int ar[] = {2,3,0,1,5,7,9};
      InsertionSort a = new InsertionSort();
      a.insertion(ar);
      a.display(ar);
    }
    public void insertion(int a[]){
       int temp;
       for(int j = 0;j<a.length-1;j++){
          for(int h=j+1;h>0;h--){
               if(a[h]<a[h-1]){
                temp = a[h-1];
                a[h-1] = a[h];
                a[h] = temp;
               }
               else break;
           }
       }
    }
    public void display(int a[]){
        for (int arr : a) {
            System.out.print(" - "+arr);
        }
    }
}
