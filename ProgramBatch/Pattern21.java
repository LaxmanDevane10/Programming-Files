
class Pattern21{
	public static void main(String[] args){

	

	    for(int i=0;i<5;i++){

	    	char ch='A';

	        for(int j=0;j<5;j++){
               
               if(i==0 || j==0 || i==4 || j==4 || i==2){
                 
                   System.out.print("* ");
                   ch--;

               } 

             // else if(i==1 && j==1 && j==2 && j==3){

             //        System.out.print(ch+" ");


             //   }
               else{
                  
                     System.out.print(ch+" ");
               }

               ch++;

              }
              
              System.out.println();
	              
	         
	    }
	}
}