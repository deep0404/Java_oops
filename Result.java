import java.util.*;

interface Sports{
        float sportwt=6.0f;
        public void getwt();
}

class Student{
        float rollNumber;
        float getNumber(){
             return this.rollNumber;
        }
        
        void putNumber(float num){
                this.rollNumber=num;
        }    
}

class test extends Student{
        float term1;
        float term2;
        
        void getmarks(){
                System.out.println("The mark of first term is: "+term1); 
                System.out.println("The mark of second term is: "+term2);               
        }
        
        void putmarks(){       
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the mark of first term");
                term1=sc.nextFloat();
                System.out.println("Enter the mark of second term");
                term2=sc.nextFloat();                
        }
}

class Result extends test implements Sports{
        public void getwt(){
                System.out.println("the weight is : "+sportwt);
                }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Result t = new Result();
        System.out.println("Enter you roll number:");
        float num=sc.nextInt();
        t.putNumber(num);
        t.putmarks();
                
        float n=t.getNumber();
        System.out.println("Roll number: "+n);
        t.getmarks();
        t.getwt();
        
        float totalscore=(t.term1 + t.term2 + t.sportwt);
        System.out.println("Total score= "+totalscore);
        
       }
}       

        

