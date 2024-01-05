package com.vinay;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;
    MobilePhone(String myNumber)
    {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing"+phoneNumber+"on  Phone");

    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Answering the Phone");
            isRinging=false;
        }
        else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber)
        {
            isRinging= true;
            System.out.println("Phone ringing");
        }
        else {
            System.out.println("Either entered wrong number or phone is off ");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}


