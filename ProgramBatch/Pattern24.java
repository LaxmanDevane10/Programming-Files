class Pattern24{
public static void main(String[] args){
	
int row=5;
int col=5;


for(int i=0;i<row;i++){

	int ch=1;
	
    for(int j=0;j<col;j++){

if(j==0  || j==2 || j==4){
	
	System.out.print(ch+" ");
	ch++;
}else{
	System.out.print("* ");
}



    }

    System.out.println();
    

}

}

}