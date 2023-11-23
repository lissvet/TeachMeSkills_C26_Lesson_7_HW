package com.teachmeskills.lesson7.task0;

public class Director implements IPosition {

    public int positionNumber;
    public String positionName;
    public Director() {
        this.positionNumber = 1;
        this.positionName = "Director";
    }

    public void showPositionName(){
        System.out.println(positionName);
    };

}
