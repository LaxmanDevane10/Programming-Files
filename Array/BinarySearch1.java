
class BinarySearch1{
	
	public static void main(String[] args){

       int[] A={2,4,6,8,10,12,14};

       int n=2;

       System.out.println(find(A,n,0,A.length-1));

	}

	public static boolean find(int[] A,int n,int st,int ed){

            if(st<=ed){

            int mid = (st+ed)/2;

            if(A[mid]==n){
    
              return true;

            }else if(A[mid]<n){

                return find(A,n,mid+1,ed);

            }else{
                
                return find(A,n,st,mid-1);

            }


            
}

    return false;


	}

}