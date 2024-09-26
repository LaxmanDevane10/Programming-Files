
class BinarySearch2{
	
public static void main(String[] args){
	
 int[] A={1,2,3,4,5,6,10};

 int[] B={2,5,8,9,10};

 int[] C={1,2,5,6,7,8,10};

 int n=10;

 printCommon(A,B,C);

 

}

    public static void printCommon(int[] A,int[] B,int[] C){

        for(int i=0;i<A.length;i++){

            
        int n=A[i];


        if(find(B,n,0,B.length-1) && find(C,n,0,C.length-1)){

            System.out.println(n);

        }



            

        }



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