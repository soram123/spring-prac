package com.springproject.xml.di.setter2;

public class Contact {
    private int contactId;
    private String contactName;
    private int contactNum;
    private Address address;

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void getContactDetails(){
        System.out.println(contactId+"...."+contactName+"...."+contactNum+"....");
        address.getAddress();
    }
}
