
class NewPattern16{
	public static void main(String[] args){
int line=4;
int star=1;
int space=6;

char ch='A';

for(int i=0;i<line;i++){

char ch2=ch;
	
for(int k=0;k<space;k++){
	
	System.out.print(" ");

}

for(int j=0;j<star;j++){

System.out.print(ch2+" ");	
ch2++;

}

System.out.println();
star+=2;
space-=2;
ch++;



}

	}
}