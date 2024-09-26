
 class BubbleSort1 {

	public static void main(String[] args){

int[] arr={10,12,9,7,5,11,8};

 bubbleSort(arr);

for (int s:arr ) {
	System.out.println(s);
}




	}

	public static void bubbleSort(int[] arr){

     for(int j=0;j<arr.length;j++){
    for(int i=0;i<arr.length-1-j;i++){ // j is reduce the iteration

    if(arr[i]>arr[i+1]){

         int temp =arr[i];
         arr[i]=arr[i+1];
         arr[i+1]=temp;
         
         }

    }

  }  

   


	}
}