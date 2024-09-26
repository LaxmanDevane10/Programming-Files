
class QuickSort2{
	
	public static void main(String[] args){

     int[] arr = {10,7,4,9,1,5,6};

    sort(arr,0,arr.length-1);

     for(int a:arr){
 
     System.out.println(a);

            }

       }     

     public static void sort(int[] arr,int st,int ed){

            if(st<ed){
        int index=seperate(arr,st,ed);

        sort(arr,st,index-1);

        sort(arr,index+1,ed);

           }

      }

     public static int seperate(int[] arr,int st,int ed){

       int last=arr[ed];

       int index=st;

       for(int i=st;i<=ed;i++){

       if(arr[i]<last){
         
         swap(arr,i,index);

             index++;
              
               }

          }

          swap(arr,index,ed);
          return index;

     }

     public static void swap(int[] arr,int i,int index){

        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;

       }

	}
