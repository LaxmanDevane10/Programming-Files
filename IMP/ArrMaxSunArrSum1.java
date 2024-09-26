


class ArrMaxSunArrSum1{

public static void main(String[] args){
	
int[] arr={-2,-3,4,-1,-2,1,5,-3};

 int maxSum = findMaxSum(arr);

 System.out.println(maxSum);

  }

  public static int findMaxSum(int[] arr){

  int maxSum = Integer.MIN_VALUE;
  int sum=0;

 for(int a : arr){

 	sum+=a;

 	if(sum>maxSum){
 		maxSum=sum;
 	}

 	if(sum<0){

 		sum=0;
 	}
 }

 return maxSum;


     }

  }

  