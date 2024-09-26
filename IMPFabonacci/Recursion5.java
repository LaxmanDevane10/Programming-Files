
class Recursion5{
	public static void main(String[] args){
         display(1);
     }

     static int n1=0,n2=1;

     public static void display(int a){
         
         if(a<=10){
          System.out.println(n1);
           int c=n1+n2;
           n1=n2;
           n2=c;
           display(++a);
        }

     }
}