
import java.util.Scanner;
class ArrayImp1{
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	int[] arr = {70,60,10,20,30,40,50,60};

	System.out.println("Enter ST");
	int st=sc.nextInt();

	System.out.println("Enter ED");
	int ed=sc.nextInt();

	reverse(arr,st,ed);

	for(int i : arr){
	System.out.print(i+" ");
	}



	}

	public static void reverse(int[] arr,int st,int ed){

while(st<ed){
	
int temp=arr[st];
   arr[st]=arr[ed];
   arr[ed]=temp;

   st++;
   ed--;
   }

	}
}