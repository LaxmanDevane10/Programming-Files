
class Array3{
public static void main(String[] args){
	
	int[] arr={10,20,30,40};

	changes(0,arr);
     
     display(0,arr);

}

    static int a=10;
public static void display(int index,int[] arr){
	
	if(index<arr.length){

   System.out.println(arr[index]);

   display(++index,arr);

	}

	   }
         
	static void changes(int index,int [] arr){
            
            if(index<arr.length){
          arr[index]*=a;

          changes(++index,arr);
           
            }


       }
}

   