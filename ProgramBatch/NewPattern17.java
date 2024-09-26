
class NewPattern17{
	public static void main(String[] args){
int line=4;
int star=1;
int space=3; // 2nd method

char ch1='A';

for(int i=0;i<line;i++){

char ch2=ch1;
	
for(int k=0;k<space;k++){
	
	System.out.print(" ");

}

for(int j=0;j<star;j++){

System.out.print(ch2++);	

}
System.out.println();
star+=2;
space--;
ch1++;

}

   }

 }  