
import java.util.Scanner;
class Palindrom{
	public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      int revNum=rev(num);

       if(num==revNum){
 System.out.println("It is palindrom number");
      }else{
      System.out.println("it is not palindrom");
      }

      }
       
     public static int rev(int num){
      int revNum=0;

      while(num!=0){

     int r=num%10;
      revNum=revNum*10+r;
      num/=10;
      }
      
     return revNum;
      }
}