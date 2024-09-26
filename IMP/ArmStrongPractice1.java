
import java.util.Scanner;
class ArmStrongPractice1{
	public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Number");

int num=sc.nextInt();

int result=IsArmstrong(num);

if(result==num){
	
System.out.println("This Is ArmStrong Number :"+result);

}else{

	System.out.println("This Is Not ArmStrong Number :"+result);

}



	}

	public static int IsArmstrong(int num){

     int sum=0;

     while(num!=0){

     int r=num%10; // get the remainder

     sum+=r*r*r;

     num/=10;

      }

      return sum;


	}
}