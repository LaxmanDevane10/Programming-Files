
import java.util.Scanner;

class BinarySearchPractice1{
	
   public static void main(String[] args){

   	Scanner sc=new Scanner(System.in);

       int[] A={10,20,30,40,50,60};

       System.out.println("Enter The Number");

     int n=sc.nextInt();

     

  System.out.println(findNumber(A,n,0,A.length-1));

     


      

      

   }

   public static boolean findNumber(int[] A,int n,int st,int ed){

          if(st<=ed){

            int mid=(st+ed)/2;

            if(A[mid]==n){

            return true;

            }else if(A[mid]<n){
              
             return findNumber(A,n,mid+1,ed);

            }else{

             return  findNumber(A,n,st,mid-1);

            }

              

          }

          return false;              

   }



}