
class NewPattern4{
	public static void main(String[] args){
int line=5;
int star=1;
int space=4;

char ch='A';
for(int i=0;i<line;i++){
	
for(int k=0;k<space;k++){
	
	System.out.print(" ");

}

for(int j=0;j<star;j++){

System.out.print(ch);	
if(ch>='D'){
	ch='A';
}else{
	ch++;
}
         

}

System.out.println();
star++;
space--;



}

	}
}