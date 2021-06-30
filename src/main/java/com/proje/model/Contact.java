package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {

    private String tcNo;
    private String adress;
    private String phoneNumber;

    public Contact(){
    }

    public Contact(String tcNo, String adress, String phoneNumber) {
        this.tcNo = tcNo;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
