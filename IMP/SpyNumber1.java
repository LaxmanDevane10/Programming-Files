
class SpyNumber1{
	public static void main(String[] args){
               int num=1124;
               if(isSpy(num)){
                  System.out.println("Spy Number");
               }else{
               System.out.println("Not Spy Number");
               }

}
       public static boolean isSpy(int num){
     int sum=0;
     int mul=1;
    while(num!=0){
      int r=num%10;
      sum+=r;
      mul*=r;
      num/=10;
          
     }
     return sum==mul;
    

	}
}