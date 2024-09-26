
import java.util.Scanner;
class ArmStrongPractice2{
	
	public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter The Number");

int num=sc.nextInt();

int result=isArmStrong(num);

System.out.println("Sum Of The Power Is :"+sum);

if(result==num){
	
	System.out.println("Number Is Armstrong :"+num);
}
else{
	
	System.out.println("Number Is Not Armstrong :"+num);
}



	}
           static int sum=0;

           
	public static int isArmStrong(int num){

     int  count=getCount(num);

     while(num!=0){

       int r=num%10;

       sum+=getPower(r,count);

       num/=10;


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

             int power=1;

             for(int i=0;i<expo;i++){

                  power*=base;

             }

             return power;

	}


}