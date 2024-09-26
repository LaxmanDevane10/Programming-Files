
import java.util.Scanner;

class ArmStrongNumber1{
	
	public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the number");
  
  int num=sc.nextInt();

int result=isArmStrong(num);

if(result==num){
	 
	 System.out.println("Number is Armstrong");
}
else{
	
	System.out.println("Number Is not Armstrong");
}
 

	}

public static  int isArmStrong(int num){
		
		int sum=0;
        
        while(num!=0){
        
        int r=num%10; // get the last digit
        
         sum+=r*r*r;
       
        num/=10; // remove the last
        }

        return sum;
	}
}