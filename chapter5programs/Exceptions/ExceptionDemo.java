package Exceptions;
public class ExceptionDemo {
	public void div(int a,int b) {
		//int arr[]= {1,2,3,4,5};
		try 
                {
		System.out.println(a/b);
                }
                catch(ArithmeticException ae)
                {
                    System.out.println("devide by zero");
                    throw new NullPointerException();
                }
                
                catch(Exception ae)
                {
                    System.out.println("generic");
                    //throw new NullPointerException();
                }
                
		finally {
			System.out.println("All resources released");
		}
		
		
	}

	public static void main(String[] args) {
		ExceptionDemo ec=new ExceptionDemo();
		try{
                     ec.div(6, 0);
                }
               
              catch(NullPointerException ae)
                {
                    System.out.println("generic");
                    //throw new NullPointerException();
                }

	}

}
