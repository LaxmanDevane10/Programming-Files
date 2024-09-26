
class Recursion1{
	public static void main(String[] args){
       
      new Recursion1().display(1);

   }

        void display(int a){
        
        if(a<=50){
        	 System.out.println("A Value Is :"+a);
                    a+=1;
         

          display(a);

        }



       }

	}
