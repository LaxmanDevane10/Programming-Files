
class Pattern32{
	
	public static void main(String[] args){
int row=4;
int col=5;



for(int i=0;i<row;i++){

int ch1=2;

for(int j=0;j<col;j++){
if(j==0 || j==4){
       
   if(ch1==0){
   	ch1+=2;
   	System.out.print(ch1+" ");
       ch1--;
   }else{
   	System.out.print(ch1+" ");
   	ch1--;
   }
		
}else if (j==1 || j==3) {
    
     System.out.print(ch1+" ");
     ch1--;

}	else{
	
	System.out.print(ch1+" ");
	ch1++;
	
}


}

System.out.println();




}

	}

}