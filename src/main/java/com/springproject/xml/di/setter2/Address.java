package com.springproject.xml.di.setter2;

public class Address {
    private int pinCode;
    private  String addressName;
    private String stateName;

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void getAddress(){
        System.out.println(pinCode);
        System.out.println((stateName));
        System.out.println(addressName);
    }
}
