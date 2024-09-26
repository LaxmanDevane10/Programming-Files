
class Pattern22{
	
	public static void main(String[] args){
   
int row=5;
int col=4;

char ch='A';

for(int i=0;i<row;i++){
	 


	 for(int j=0;j<col;j++){
             
             if(i==0 || i==2 || i==4 ){
          
            System.out.print(ch+" ");
          
     }
    
     else{
       
       System.out.print("* ");
         
         }

    
}

System.out.println();
if(i%2==0){
    ch++;
  }

}

	}

}