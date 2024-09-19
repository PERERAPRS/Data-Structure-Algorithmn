package Searching_Algo;

public class BinaryS {
public static void main(String []arg){
    BinaryS o = new BinaryS();
    int ar[] = {1,2,3,4,5,6,7,8,20};
    int index = o.Bsearch(20, ar);
    if(index != -1)
      System.out.println("index : "+index);
    else System.out.println("Not Found!");
} 

public int Bsearch(int value,int a[]){
    int first = 0,last = a.length-1,mid;     
    while (first <= last) {
       mid = (first+last)/2;
       int midleEle = a[mid];
       if(midleEle == value) return mid;
       if(value<midleEle) last = mid-1;
       else first = mid+1;
    }
    return  -1;
}
}
