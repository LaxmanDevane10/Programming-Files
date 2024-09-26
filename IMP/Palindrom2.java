
import java.util.Scanner;
class Palindrom2{
	public static void main(String[] args){
     
     for(int i=10;i<=1000;i++){
           int num=i;
      int revNum=rev(num);

       if(num==revNum){
 System.out.println(revNum);
      }
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