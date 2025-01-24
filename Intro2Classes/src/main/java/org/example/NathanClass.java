package org.example;

public class NathanClass {
    public static void main(String[] args) {
        Sample mySampleClass = new Sample();
        mySampleClass.printFakeAge();
        Sample secondSampleClass = new Sample(41);
        secondSampleClass.printFakeAge();
        secondSampleClass.setFakeAge(23);
        secondSampleClass.printFakeAge();
        secondSampleClass.setFakeAge(0);
//        mySampleClass.setFakeAge(39);
//        mySampleClass.printFakeAge();
//        mySampleClass.increaseAgeByOne();
//        mySampleClass.printFakeAge();
//        int theAge = mySampleClass.getFakeAge();
//        System.out.println(theAge);


    }
}