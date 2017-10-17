package org.apache.struts.edit.model;

public class User
{
    private String userName;
    private String password;
    private String sign;
    private String phoneNumber;
    private String address;

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getSign()
    {
        return sign;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    @Override
    public String toString()
    {
        return "Usr [ " + userName + ", " + password + ", " + sign + ", " + phoneNumber + ", " + address + "]";
    }

    public User(){}

    public User(String userName, String password, String sign, String phoneNumber, String address){
        this.userName = userName;
        this.password = password;
        this.sign = sign;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
