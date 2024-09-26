
class Array2{
	public static void main(String[] args){

	int[] arr={10,20,30,40,50};

      display(arr,0);
	}

	public static void display(int[] arr,int index){

       if(index<arr.length){

        System.out.println(arr[index]);

        index++;

        display(arr,index);

  
       }

	}
}