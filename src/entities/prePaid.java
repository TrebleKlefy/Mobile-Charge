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
public class prePaid extends customer {
      private double prePaidCharges;
      
      public double prePaidMonthlyCost(){
       return  this.getPrePaidCharges()*2.99;
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
     * @return the prePaidCharges
     */
    public double getPrePaidCharges() {
        return prePaidCharges;
    }

    /**
     * @param prePaidCharges the prePaidCharges to set
     */
    public void setPrePaidCharges(double prePaidCharges) {
        this.prePaidCharges = prePaidCharges;
    }
}
