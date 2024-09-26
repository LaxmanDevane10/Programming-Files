
import java.util.Scanner;
class Recursion6{
	public static void main(String[] args){
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int num=sc.nextInt();
      getFactorial(num);
      System.out.println("Factorial Is :"+fact);

       }
           static int fact=1;
       public static void getFactorial(int num){
          
          if(num>=1){
              fact*=num;
             
           getFactorial(num-1);

          }



       }
}