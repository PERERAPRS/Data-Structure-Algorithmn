package searching_Alogo;

public class BubleSort {
    public static void main(String []arg){
        BubleSort o  =new BubleSort();
        int ar[] = {11,24,-3,4,5,36,-1};
        o.buble(ar);System.out.println();System.out.println();
        o.display(ar);
    }
    public void buble(int a[]){
        int temp;
        for(int i = 0;i<a.length;i++){
           for(int j=0;j<a.length-i-1;j++){
            if(a[j]>a[j+1]){
              temp = a[j+1];
              a[j+1] = a[j];
              a[j] = temp;
            }
            System.out.println();
            display(a);
        }System.out.println();
    }
}
        public void display(int a[]){
            for (int arr : a) {
                System.out.print(" | "+arr);
            }
        }
}
