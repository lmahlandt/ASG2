/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg2;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ldmpp5
 */
public class Account 
{
    private double balance;
    private int firstdate;
    private int seconddate;
    private boolean dateflag = false;
    private double rate;

        public void deposit()
        {
            
           Scanner sc = new Scanner(System.in); 
           System.out.println("Enter deposit amount");
           double input = sc.nextDouble();
           balance = balance + input;
           System.out.println("Your balance is: " + balance);
            
        }
        
        public void checkBalance()
        {
            
        Locale us = new Locale("us");
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
        
        System.out.println("Your current balance is: " + usFormat.format(balance));
            
        }
        public void withdraw()
        {
            
            
            
        }
        public void getdate1()throws IOException
        {
            
            System.out.println("Enter Date ('mm/dd/yyyy')");
            Calendar cal1 = Calendar.getInstance();
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            SimpleDateFormat formatter;
            formatter = new SimpleDateFormat("MM/dd/yyyy");
            ParsePosition pos = new ParsePosition(0);
            Date date = formatter.parse(input, pos);
            cal1.setTime(date);
            firstdate = cal1.get(Calendar.DAY_OF_YEAR);
            dateflag = true;
            
            
        }
        public void getdate2()
        {
            
            System.out.println("Enter Date ('mm/dd/yyyy')");
            Calendar cal2 = Calendar.getInstance();
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            SimpleDateFormat formatter;
            formatter = new SimpleDateFormat("MM/dd/yyyy");
            ParsePosition pos = new ParsePosition(0);
            Date date = formatter.parse(input, pos);
            cal2.setTime(date);
            seconddate = cal2.get(Calendar.DAY_OF_YEAR);
            
            if(seconddate >= firstdate)
            {
                
                firstdate = seconddate;
                
            }
            else
            {
                
                System.out.println("Please enter a date past " + firstdate);
                
            }
            
        }
        public void calcInterest()
        {
            
            int datediff = seconddate - firstdate;
            rate = .05/365;
            double ratetime = Math.pow(1+rate,datediff);
            balance = balance * ratetime;
            firstdate = seconddate;
            
        }
        
        public void menu()
        {
            int input = 0;
            Scanner sc = new Scanner(System.in);
            
            while(input != 4)
            {
                
                System.out.println("1) Deposit");
                System.out.println("2) Withdraw");
                System.out.println("3) Check Balance");
                System.out.println("4) Exit");
                
                input = sc.nextInt();
                if(input == 1)
                {
                    
                    deposit();
                    
                }
                else if (input == 2)
                {
                    withdraw();
                }
                else if (input == 3)
                {
                    checkBalance();
                }
                else if (input != 1 && input != 2 && input != 3)
                {
                    
                }
                
            }
            
            
        }
        
        
    }
    

