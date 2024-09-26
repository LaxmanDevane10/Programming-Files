
class ArrayMin{
	public static void main(String[] args){

    int[] arr={7 , 5 , 1 , 3 , 8 , 4};
    
    int min=findMin(arr);

    System.out.println(min);

    }
        
	public static int findMin(int[] arr){

     int max=arr[0];
     int n=arr.length;

      for(int i=0;i<n;i++){
           

        if(max<arr[i]){
         
          max=arr[i];
        }

      }

      return max;

	}
}