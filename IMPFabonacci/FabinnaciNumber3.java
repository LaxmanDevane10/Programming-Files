
import java.util.Scanner;
class FabinnaciNumber3{
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();

int n1=0,n2=1;
int a=0;

while(n1<num){
	System.out.println(n1);
	int c=n1+n2;
	n1=n2;
	n2=c;
	
}

	}
}