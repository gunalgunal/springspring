package com.atm;
import java.util.*;
import java.io.*;

public class Account extends Menu {
	 Scanner obj=new Scanner(System.in);
     HashMap<Integer,Integer> pin=new HashMap<Integer,Integer>();
       int u;
   public void login()
   {
     
     
         pin.put(12,3);
         pin.put(45,6);
        System.out.println("Welcome to Automated teller machine!");
        try{
          System.out.println("Enter your pin number");
          u=obj.nextInt();
          }
       catch(Exception e)
        { 
    	   System.err.println("not an number");
    	   
    	   }
        for(int i:pin.keySet()){
              if(u==pin.get(i))
                      option(); 
              if(u!=pin.get(i))
            	  System.out.println("Wrong pin number"); 
            	  
        }
              
  }
     public void option()
     {
             System.out.println("Select your account");
              System.out.println("1.current account\n2.Savings account\n3.exit");
          
           int z=obj.nextInt();
             switch(z){
                case 1:
                   current();
                   break;
               case 2:
                   saving();
                    break;
               case 3:
                  System.out.println("Thank you for using my atm");
                  break;
           }
}
public void current()
{ 
        System.out.println("CURRENT ACCOUNT"); 
        System.out.println("1.balance\n2.withraw\n3.deposit\n4.exit"); 
        int f=obj.nextInt();
        switch(f)
        {
            case 1:
              currentBalance();
               option();
                break;
             case 2:
                 withDrawCurrent();
                 option();
                 break;
             case 3:
                 depositCurrent(); 
                 option();
                 break; 
             case 4:
                 System.out.println("thank you");
                  break ;
}
}
       public void saving()
       {
            System.out.println("SAVINGS ACCOUNT");
            System.out.println("1.balance\n2.withdraw\n3.deposit\n4.exit");
            int f=obj.nextInt();
            switch(f)
            {
                 case 1:
                  balanceS();
                   option();
                   break;
                 case 2:
                   withDrawSaving();
                   option();
                   break;
                 case 3:
                   depositSaving();
                   option();
                   break;
                         
                 case 4:
                    System.out.println("Thank you");
                    
                    break;
              }
}
                
   

              
                  
}             
                    
              
            

