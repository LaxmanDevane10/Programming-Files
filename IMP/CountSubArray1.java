
class CountSubArray1{
    public static void main(String[] args){
        int[] arr={0,1,1,1,0,0,1,0};
        int count=countSubArray(arr);
        System.out.println("Sub Count Of Array :"+count);
    }
    public static int countSubArray(int[] arr){
        int count=0,subArr=0;
        for(int a: arr){
            if(a==0){
                count++;

     }
            if(a==1){
                count--;
            }
            if(count==0){
                subArr++;
            }
        }
        return subArr;
    }

}