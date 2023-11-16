import java.util.*;

class Binary{
        int binarySearch(int a[],int x,int size){
                int l=0;
                int r=size-1;
                int m;
                while(l<=r){
                        m= (r+l)/2;

                        if(a[m]>x)
                                r=m-1;
                                
                        if(a[m]<x)
                                l=m+1;
                                
                        if(a[m]==x)
                                return m;
                }
                return -1;
              }
         
        public static void main(String args[]){
                Scanner sc= new Scanner(System.in);
                Binary bi= new Binary();
                int a[]=new int[20];
                System.out.println("Enter the size of array");
                int size=sc.nextInt();
                System.out.println("Enter the elements");
                for(int i=0;i<size;i++)
                        a[i]=sc.nextInt();
                
                System.out.println("Enter the element you want to search");
                int x=sc.nextInt();
                
                int y= bi.binarySearch(a,x,size);
                if(y==-1)
                        System.out.println("The element is not present");
                else
                        System.out.println("The element is present int the index: "+y);
        }
}                
                                
                         
                        
