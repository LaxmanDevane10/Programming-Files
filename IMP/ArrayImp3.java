
import java.util.Scanner;
class ArrayImp3{
	public static void main(String[] args){

     Scanner sc=new Scanner(System.in);

     int[] arr={2,0,1,1,0,0,2,1,2};

     shiftAll(arr);

     for(int i:arr){

     System.out.print(i+" ");
     
     }

	}

    public static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
         
	public static void shiftAll(int[] arr){

      int m=0, i=0,n=arr.length-1;

      while(i<n){
     switch(arr[i]){

     case 1 :

     swap(arr,i,m);

     m++;

     i++;

      break;

      case 0 :

      i++;

      break;

      case 2 :

      swap(arr,i,n);

      n--;

     break;

       




     }
}


	}
}