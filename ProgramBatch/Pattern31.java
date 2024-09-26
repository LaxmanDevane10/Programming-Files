
class Pattern31{
	
	public static void main(String[] args){
int row=5;
int col=4;

char ch1='A';

for(int i=0;i<row;i++){


for(int j=0;j<col;j++){
	
System.out.print(ch1+" ");
ch1++;
     if(ch1>='G' ){
      
   ch1='A';
}


}

System.out.println();



}

	}

}