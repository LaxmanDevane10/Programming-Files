
class Pattern33{
	
	public static void main(String[] args){
int row=5;
int col=5;


 
int ch1=0;
for(int i=0;i<row;i++){
   
int ch2=ch1;

for(int j=0;j<col;j++){
  if(j==0 || j==2 || j==4)	{
      
     
      	System.out.print(ch2+" ");
      ch2++;
      
      
}else{
	   
 System.out.print(ch2+" ");
 ch2--;
	}
	
}

System.out.println();
if(ch1>=1){
     ch1--;
}else{
	ch1++;
}


}

	}
}




