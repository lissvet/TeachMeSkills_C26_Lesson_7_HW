package com.teachmeskills.lesson7.task0;

public class Employee implements IPosition {

    String positionName;
    int positionNumber;
    public Employee() {
        this.positionNumber = 2;
        this.positionName = "Employee";
    }

    public void showPositionName(){
        System.out.println(positionName);
    }

}
