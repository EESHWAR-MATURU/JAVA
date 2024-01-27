/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Lenovo
 */
public class BasicException 
{
    public static void main(String arg[])
    {
        int a=6,b=0,c = 0;
        int l[]= {1,2,3,4,5};
            try
            {
                c = a/b;
                //System.out.println(l[7]);
            }
            
            catch(ArithmeticException ae)
            {
                System.out.println("U can not devide with 0");
                c = a/(b+1);
            }
            catch(ArrayIndexOutOfBoundsException ae)
            {
                System.out.println("array out of bounds");
                //c = a/(b+1);
            }
            catch(Exception ae)
            {
                System.out.println("generic exception");
                //c = a/(b+1);
            }
            
            finally
            {
                System.out.println("released all memory");
            }
            
            System.out.println("C = "+c);
            System.out.println("there is 100 more lines ");
        
    }
}
