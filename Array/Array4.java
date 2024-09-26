
class Array4{
	
	public static void main(String[] args){
int [] arr= {10,20,30,40,50};

arrReverse(arr);

for(int i:arr){
	System.out.println(i);
}


	}

         
	public static void arrReverse(int[] arr){
		int st=0, ed=arr.length-1;
     while(st < ed){
     int temp =arr[st];
         arr[st]=arr[ed];
         arr[ed]=temp;

         st++;
         ed--;
       }
	}

}