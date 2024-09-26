
class Pattern36{
	
	public static void main(String[] args){
int row=5;
int star=1;
char ch1='A';

for(int i=0;i<row;i++){

char ch2=ch1;

for(int j=0;j<star;j++){
System.out.print(ch1+" ");
ch2++;


}

System.out.println();
star++;
ch1++;



}

	}

}