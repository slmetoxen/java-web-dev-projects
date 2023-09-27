package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        BaseDisc cd = new CD("Fan Mail", 750, "TLC"); //can't get child class methods from here
        BaseDisc dvd = new DVD("Gladiator", 1500, "action");

        // TODO: Call each CD and DVD method to verify that they work as expected.
//        System.out.println(cd.getBasicInfo());
//        System.out.println(dvd.getBasicInfo());
//
//        System.out.println(cd.writeData("Don't Go Chasing Waterfall."));
//        System.out.println(dvd.writeData("Are you not entertained?"));

// If you want to implement a method from the child class that does not exist in the parent we have to do some casting
        OpticalDisc newCD = (OpticalDisc) cd;
        newCD.spinDisc();
        //or
        CD newCd = (CD) cd;//type CD
        newCd.spinDisc();//features of OpticalDisc
        System.out.println(newCd.getBasicInfo());//features of the parent BaseDisc
        newCd.playSong();//features of CD
    }
}