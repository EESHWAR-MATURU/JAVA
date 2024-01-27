// rethrow of exception and exception propagation example 
package Exceptions;
public class ExeceptionPro {
	public void div(int a,int b) {
		
		try 
                {
		System.out.println(a/b);
                
                }   
                catch(ArithmeticException ae)
                {
                    System.out.println("devide by zero");
                    throw new NullPointerException();
                }        
                
		finally {
			System.out.println("All resources released");
		}
		
		
	}

	public static void main(String[] args) {
		ExeceptionPro ec=new ExeceptionPro();
		try
                {
                ec.div(6, 0);
                }
                catch(NullPointerException ae)
                {
                    System.out.println("Null pointer handled");
                }
              

	}

}
