package com.teachmeskills.lesson7.task0;

public class Accountant implements IPosition {

    int positionNumber;
    String positionName;
    public Accountant() {
        this.positionNumber = 3;
        this.positionName = "Accountant";
    }

    public void showPositionName(){
        System.out.println(positionName);
    }

}
