
class NewPattern10{
	public static void main(String[] args){
int line=4;
int star=4;
int space=0;
char ch1='D';
for(int i=0;i<line;i++){
	char ch2=ch1;
for(int k=0;k<space;k++){
	
	System.out.print(" ");

}

for(int j=0;j<star;j++){

System.out.print(ch2);
ch2--;	

}

System.out.println();
star--;
space++;
ch1--;

}

	}
}