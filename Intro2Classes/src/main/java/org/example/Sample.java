package org.example;

public class Sample {
    private int fakeAge;
    public Sample() {}

    public Sample(int fakeAge) {
        this.fakeAge = fakeAge;
    }



    public void printFakeAge() {
        System.out.println(this.fakeAge);
    }

    private void incrementFakeAge() {
        this.fakeAge++;
    }

    public void setFakeAge(int fakeAge) {
        if (this.fakeAge > 0) {
            System.out.println("Age already set");
            return;
        }
        if (fakeAge <0 || fakeAge > 120) {
            this.fakeAge = 0;
            System.out.println("Invalid Age - Failed");
            return;
        }
        this.fakeAge = fakeAge;
    }

    public int getFakeAge() {
        return this.fakeAge;
    }

    public void increaseAgeByOne() {
        incrementFakeAge();
    }


}
