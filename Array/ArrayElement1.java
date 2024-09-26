
class ArrayElement1{
	
public static void main(String[] args){
	
	int[] arr={1,2,3,4,5};

	rotateArr(arr,3);

	for(int a : arr ){
      
      System.out.print(a+" ");

	}

}	

	public static void rotateArr(int[] arr,int m){

for(int j=0;j<m;j++){
     int n=arr.length-1;
	int last = arr[n];

for(int i=n;i>0;i--){
	
      arr[i]=arr[i-1];


}

 arr[0]=last;

      }
	
   }

}