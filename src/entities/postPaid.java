/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import superclass.customer;

/**
 *
 * @author ASUS
 */
public class postPaid extends customer {
    
     private double postPaidCharge;
     
     
      public double postPaidMonthlyCost(){
       return  this.getPostPaidCharge()*1.50;
      }
    
    
   @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }

    @Override
    public String getTelephoneNumber() {
        return super.getTelephoneNumber();
    }

    @Override
    public void setTelephoneNumber(String telephoneNumber) {
       super.setTelephoneNumber(telephoneNumber);
    }

    /**
     * @return the postPaidCharge
     */
    public double getPostPaidCharge() {
        return postPaidCharge;
    }

    /**
     * @param postPaidCharge the postPaidCharge to set
     */
    public void setPostPaidCharge(double postPaidCharges) {
        this.postPaidCharge = postPaidCharges;
    }
}
