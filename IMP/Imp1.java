

class Imp1{
	public static void main(String[] args){

           int primeCount=0;  
           int n=1;



           while(primeCount<5){             
       int count=0;
      for(int i=1;i<=n;i++){

       if(n%i==0)

       	  count++;

       }
           
           if(count==2){
       System.out.println(n);
               primeCount++;
        }
         n++;

         }

       
         }

       }

