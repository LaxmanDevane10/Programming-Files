
class PatternSpecial{
	
public static void main(String[] args){
	
char[] arr ={'S','T','A','R'};

printPattern(arr);


}

public static void printPattern(char[] arr){
	
int line=4;
int star=4;
int ch1=0;

for(int i=0;i<line;i++){
	
	int ch2=ch1;

	for(int j=0;j<star;j++){

System.out.print(arr[ch2]+" ");

ch2++;


if(ch2>3){
	
	ch2=0;
}



	}
	System.out.println();
	ch1++;
}


}

}