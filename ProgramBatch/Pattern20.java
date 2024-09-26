
class Pattern20{
	
    public static void main(String[] args){

        for(int i=0;i<5;i++){

	    	int number=1;


	        for(int j=0;j<5;j++){
               
               if(i==0 || j==0 || i==4 || j==4){
                   
                   System.out.print("* ");

                   number--;

               }

              // else if(i==1 && j==1 && j==2 && j==3){

              //       System.out.print(number+" ");


              //  }else if (i==2 && j==1 && j==2 && j==3) {
               	
              //  	System.out.print(number+" ");

              //  }
               else{
                  
                     System.out.print(number+" ");
               }

                number++;
	         

              }
              
              System.out.println();
	             
	    }
	}
}