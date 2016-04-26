/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg2;

import java.util.Scanner;

/**
 *
 * @author ldmpp5
 */
public class ATM 
{
    Account[] accs = new Account[3];
    public static void main(String[] args) throws Exception
    {
        
        ATM ac = new ATM();
        int input;
        System.out.println("Is this the first time running this program? 1 for Yes and 2 for No");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if(input == 1)
        {
            
            ac.populateAccts();
            
        }
        
        else if(input == 2)
        {
        
            ac.pickAccts();
            
        }

    }
    
    public void populateAccts()
    {
        
       for(int i = 0; i < accs.length; i++)
        {
            accs[i] = new Account();
        } 
        
    }
    public void pickAccts()
    {
        
        int input;
                
                do
                {                    
                    System.out.println("Choose an account:");
                    System.out.println("1) Account 1");
                    System.out.println("2) Account 2");
                    System.out.println("3) Account 3");
                    System.out.println("4) Exit");
                    
                    Scanner sc = new Scanner(System.in);
                    input = sc.nextInt();
                    System.out.println("You Chose: " + input);    

                    if(input == 1)
                    {
                        accs[input-1].menu();
                    }
                    else if(input == 2)
                    {
                        accs[input-1].menu();
                    }
                    else if(input == 3)
                    {
                        accs[input-1].menu();
                    }
                }while(input != 4);
        
    }
}

