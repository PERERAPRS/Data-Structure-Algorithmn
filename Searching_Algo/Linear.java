package Searching_Algo;
public class Linear{
    public static void main(String []arg){
       Linear o = new Linear();
       int ar[] = {2,1,6,77,4,32,9,0,-3,-1,3};
       o.LSearch(3,ar);
    }
    
    public void LSearch(int value,int a[]){
        int i = 0;
        while(i<a.length){
            if(value==a[i]){
               System.out.println("Found at Index : "+i);
               break;
            }
            i++;
        }
    }

}