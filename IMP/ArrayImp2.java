
import java.util.Scanner;
class ArrayImp2{
	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	int[] arr = {20,-10,30,-20,-30,40,50,-60}; 

	leftShift(arr);

	

	

	for(int i : arr){
	System.out.println(i);
	}



	}

	public static void leftShift(int[] arr){

      int index=0;
     
for(int i=0;i<arr.length;i++){


	
	if(arr[i]<0){

int temp=arr[i];
   arr[i]=arr[index];
   arr[index]=temp;
        
        index++;
  }
  
   
     

   }

	}
}