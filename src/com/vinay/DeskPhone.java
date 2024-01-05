package com.vinay;

public class DeskPhone implements Telephone {
    private String myNumber;
    private boolean isRinging;
    DeskPhone(String myNumber)
    {
        this.myNumber=myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone is always powered");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing"+phoneNumber+"on DeskPhone");

    }

    @Override
    public void answer() {
     if(isRinging)
     {
         System.out.println("Answering the DeskPhone");
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
        //    System.out.println(" ");
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
