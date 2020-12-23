/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digicel;

import entities.postPaid;
import entities.prePaid;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DigicelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner userInput = new Scanner(System.in);
        int value = 0;
  
        while(value != 3){
         System.out.print("\tDigicel Customer Service\n\n");
         System.out.println("[1] Prepaid Cutomer\n" + "[2] PostPaid Costumer\n"+ "[3] Exit\n\nEnter an Option:");
         
         value = userInput.nextInt();
         switch(value){
             case 1: 
             DigicelMain.MenuOne();
                 break;
             case 2: 
               DigicelMain.MenuTwo();
                 break;
             case 3:
                 exit(0);
         }
    }
     
    }
    
    static  public void MenuOne(){
     prePaid prePaidCustomer = new prePaid();
    
    Scanner input = new Scanner(System.in);
      System.out.print("\tFill out the form for Digicel PrePaid\n");
      System.out.println("Enter your Full Name:");
      prePaidCustomer.setCustomerName(input.nextLine());
      System.out.println("Enter your Phone Number:");
      prePaidCustomer.setTelephoneNumber(input.nextLine());
      System.out.println("Enter Number of minutes for calls:");
      prePaidCustomer.setPrePaidCharges(input.nextDouble());
      System.out.println(" Thank you, your Postmaid Monthly cost is :" + "$ " + prePaidCustomer.prePaidMonthlyCost());
      System.out.println(prePaidCustomer.getCustomerName()+" Thank you for making it Digicel \n");
      
      
        
    }
    
    static  public void MenuTwo(){
        
    postPaid postPaidCustomer = new postPaid();
    
    Scanner userInput = new Scanner(System.in);
      System.out.print("\tFill out the form for Digicel PostPaid\n");
      System.out.println("Enter your Full Name:");
      postPaidCustomer.setCustomerName(userInput.nextLine());
      System.out.println("Enter your Phone Number:");
      postPaidCustomer.setTelephoneNumber(userInput.nextLine());
      System.out.println("Enter Number of minutes for calls:");
      postPaidCustomer.setPostPaidCharge(userInput.nextDouble());
      System.out.println("Thank you, your Postmaid Monthly cost is :" + "$ " + postPaidCustomer.postPaidMonthlyCost());
      System.out.println(postPaidCustomer.getCustomerName()+" Thank you for making it Digicel \n");
      
     }
    
}
