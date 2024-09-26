
import java.util.Scanner;
class FabinnaciNumber2{
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
         int n1=0,n2=1;
      for(int i=0;n1<num;i++){
          System.out.println(n1);
        int c=n1+n2;
        n1=n2;
        n2=c;
      }

	}
}