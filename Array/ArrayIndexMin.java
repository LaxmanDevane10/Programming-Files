
class ArrayIndexMin{
	public static void main(String[] args){

    int[] arr={7 , 5 , 1 , 3 , 2 , 4};
    
    findMin(arr);

    for(int min : arr){
    	System.out.println(min);
    }

    

    }
        
	public static void findMin(int[] arr){

       for(int j=0;j<arr.length;j++){
     
     	int indexmin=j;
     

      for(int i=j;i<arr.length;i++){
           

        		if(arr[i]<arr[indexmin]){
         
          		indexmin=i;
        		}
        }
        int temp=arr[j];
        arr[j]=arr[indexmin];
        arr[indexmin]=temp;    

    }
  }
}