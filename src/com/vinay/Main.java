package com.vinay;

public class Main {
    public static void main(String[] args) {
        DeskPhone dp=new DeskPhone("12332456");
        dp.powerOn();
        dp.callPhone("12332456");
        dp.answer();
        MobilePhone mp=new MobilePhone("9026212231");
        mp.powerOn();
        mp.callPhone("9026212231");
        mp.answer();
    }
}
