/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Lenovo
 */
public class MinBalException extends Throwable
{
    float mbal;
    MinBalException()
    {
        mbal = 500;
    }
    void withdraw()
    {
        float bal = 10000;
        float amt = 9600;
        
        if(bal-amt < mbal)
        {
            try{
            throw new MinBalException();}
            catch(MinBalException ae)
            {
            System.out.println("U should maintain min balance of 500");
            }
        }
        else
        {
            bal = bal - amt;
            System.out.println("Amount Withdrawn : "+amt);
            System.out.println("Balance : "+bal);
        }
    }
    public static void main(String arg[])
    {
        MinBalException obj = new MinBalException();
        
        obj.withdraw();
        
        
    }
}
