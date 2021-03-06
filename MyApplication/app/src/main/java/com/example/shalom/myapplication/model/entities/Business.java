package com.example.shalom.myapplication.model.entities;

/**
 * Created by Shalom on 11/26/2016.
 */

public class Business
{
    int id;
    String name;
    Address address;
    String telephoneNumber;
    String email;
    String websiteAddress;

    public Business(int id, String name, Address address, String telephoneNumber, String email, String websiteAddress)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.websiteAddress = websiteAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber)
    {
        this.telephoneNumber = telephoneNumber;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }

    public static String[] COLUMNS()
    {
        String[] COLOMNS = {
                "id",
                "name",
                "telephoneNumber",
                "email",
                "websiteAddress"
        };
        return COLOMNS;
    }////////////// יש צורך לתקן פונקציה זו ולשרשר לה את ההמשך כלור לשים בה את משתני הכתובת

}
