
class Recursion4{
	public static void main(String[] args){
      
      display(5);
      System.out.println(b);

       }
            static int b;
       public static void display(int a){
          
          if(a<=100){
           b+=a;
                         
            display(a+=5);

          }



       }
}