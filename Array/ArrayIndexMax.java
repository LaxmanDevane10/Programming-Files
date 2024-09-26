
class ArrayIndexMax{
	
public static void main(String[] args){

    int[] arr={ 100 , 25 , 31 , 101 , 97 , 65 , 109};
    
    findMin(arr);

    for(int max : arr){
    	System.out.println(max);
    }

    

    }
        
	public static void findMin(int[] arr){

       for(int j=0;j<3;j++){
     
     	int indexmax=j;
     

      for(int i=j;i<arr.length;i++){
           

        		if(arr[i]>arr[indexmax]){
         
          		indexmax=i;
        		}
        }
        int temp=arr[j];
        arr[j]=arr[indexmax];
        arr[indexmax]=temp;    

    }
  }

}