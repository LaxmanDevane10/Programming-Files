
import java.util.Scanner;
class Recursion7{
	public static void main(String[] args){
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      getFactors(num,num);
         
     if(count==2){
     	System.out.println("Prime Number");
     }else{
     	System.out.println("Not Prime");
     }
  

       }
            static int count;
       public static void getFactors(int num,int a){
          
          if(a>=1){ // for handle the recursion and to avoid the stack overloading
                if (num%a==0) {
                	
                	count++;

                	 getFactors(num,a-1);

                }

                


          }

            

       }
}