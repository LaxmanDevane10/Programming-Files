
import java.util.Scanner;

class LinrearArray1{
	
	public static void main(String[] args){

Scanner sc=new Scanner(System.in);

 char [] arr={'F','A','R','A','N','A','N','D','R','A','J','U'};

 System.out.println("Enter The Character");

 char n=sc.next().charAt(0);
  
           int index=find(arr,n);

         System.out.println("Index Of the Element :"+index);



	}

	public static int find(char[] arr,char n){

for(int i=0;i<arr.length;i++){

     if(arr[i]==n){
         
         return i;
          
       
     }
         
  }
       return -1;
	}
}