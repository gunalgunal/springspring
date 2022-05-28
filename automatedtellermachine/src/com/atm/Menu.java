package com.atm;
import java.util.*;
public class Menu {
	 Scanner obj=new Scanner(System.in);
     public int balance=0;
     public int savingbalance=0;
     public void balanceS()
     {
           System.out.println("the saving balance is:" + savingbalance);
     }
     public   void currentBalance()
     {
         System.out.println("Your balance is"+ " "+ balance);
           
     }
   
     public void withDrawSaving()
     {
             System.out.println("Enter the amount you want to withdraw:");
             int f=obj.nextInt();
             if((savingbalance-f)>=0)
             {
                       System.out.println("The balance is" +savingAmountBalance(f));
             }
            else  
            	System.out.println("not possible");  
      }
     public void withDrawCurrent()
     {
  	  System.out.println("Enter the amount:")
        int z=obj.nextInt();
        if((balance-z)>=0)
        {
               System.out.println("The new balance is:"  +  checkWithdrawBalance(z));
              
        }
        else
             System.out.println("No possible");
   
                
     }
    public void depositSaving()
    {
           System.out.println("Enter the amount");
           int f=obj.nextInt();
           if((balance+f)>=0)
                   System.out.println("The balance is" + depositAmountBalance(f));
          
    }
   
    public void depositCurrent()
    { 
    	 System.out.println("Enter your deposit amount:");
         int f=obj.nextInt();
           if((f + balance)>=0)
           {
              System.out.println("your new balance is" +  checkDepositBalance(f));
             
           }
    }
   
   
  
   public int checkWithdrawBalance(int num)
   {
      balance=balance-num;
      return balance;
   }
   
  public int checkDepositBalance(int deposit)
  {
     balance=(balance+deposit); 
     return balance;
   }
  public int savingAmountBalance(int f)
  {
    savingbalance=savingbalance-f; 
    return savingbalance;
  }
  public int  depositAmountBalance(int f)
  { 
   	savingbalance=f+savingbalance;
   	return savingbalance;
   }
 
      
   


}              


