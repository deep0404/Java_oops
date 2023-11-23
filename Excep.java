import java.io.*;
import java.util.*;

class Excep{
void CheckAge(int age) throws ArithmeticException{
        if(age < 18){
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            }
        if(age > 18)
                System.out.println("Access granted");

}
        
public static void main(String args[]){
        int num;
        Excep obj=new Excep();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int x=sc.nextInt();
        obj.CheckAge(x);
        System.out.println("Enter a number");
        num= sc.nextInt();
        
        try{
                int a= 10/num;
                System.out.println("The result is="+a);
        }catch(ArithmeticException e){
                System.out.println("an ERROR has occured");
                e.printStackTrace();
                
        }finally{
                System.out.println("Try and catch block finished running");                
        }
}
}
                
        
        
