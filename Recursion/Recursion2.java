
class Recursion2{
	public static void main(String[] args){

         display(1);

        

}
         static void display(int a){
           if(a<=10){
           
          System.out.println("7 X "+a+" = "+(a*7));
           
           
             
              display(++a);

           }

         
            
         } 

	
}