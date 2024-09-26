
import java.util.Scanner;

class ArmStrongNumber2{
	
	public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the number");
  
  int num=sc.nextInt();

int result=isArmStrong(num);

System.out.println("Sum Of Individual Number Is :"+sum);


if(result==num){
	 
	 System.out.println("Number is Armstrong :"+result);
}
else{
	
	System.out.println("Number Is not Armstrong :"+result);
}
 

	}

	static int sum=0;


public static  int isArmStrong(int num){
		
		
		int count=getCount(num);
        
        while(num!=0){
        
        int r=num%10; // get the last digit
        
         sum+=getPower(r,count);
       
        num/=10; // remove the last digit from number
         
         }

        return sum;
	}

	public static int getCount(int num){
	int count=0;
	     while(num!=0){
             count++;
             num/=10;
       
	     }
	     return count;
	}

	public static int getPower(int base,int expo){

              int pow=1;

           for(int i=0;i<expo;i++){
     
             pow*=base;       

           }

           return pow;

	}
}