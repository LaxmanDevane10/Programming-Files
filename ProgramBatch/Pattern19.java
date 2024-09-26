
class Pattern19{
	public static void main(String[] args){

	char ch='D';

	    for(int i=0;i<5;i++){

	        for(int j=0;j<5;j++){
           
            if(i==0 || j==0 || i==4 || j==4){
                   
                   System.out.print("* ");
                   
                   
                   }

              // else if(i==1 && j==1 && j==2 && j==3){

              //       System.out.print(ch+" ");
                   


              //  }else if (i==2 && j==1 && j==2 && j==3) {
               	
              //  	System.out.print(ch+" ");
               	

              //  }
               else{
                  
                     System.out.print(ch+" ");
                    
               }
                
                  }
       System.out.println();
                ch--;
	              
	         
	    }
	}
}