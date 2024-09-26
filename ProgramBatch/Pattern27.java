
class Pattern27{
	
	public static void main(String[] args){
int row=4;
int col=4;

char ch1='G';

for(int i=0;i<row;i++){
	
char ch2=ch1;

for(int j=0;j<col;j++){
	
System.out.print(ch2+" ");
ch2--;

}

System.out.println();
ch1--;

}

	}

}