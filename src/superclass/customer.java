/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclass;

/**
 *
 * @author ASUS
 */
public class customer {
    private String customerName;
    private String telephoneNumber;
    
    public customer(String customerName,String telephoneNumber){
        customerName = this.customerName;
        telephoneNumber = this.telephoneNumber;
        
       
}
     public customer(){
        customerName="";
        telephoneNumber ="";
       
}

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
     
}
