package com.teachmeskills.lesson7.task0;

import java.util.Scanner;
/**Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that specifies the behavior for displaying the job title on the screen.
 * Implement this method in the created classes.
 * Create a class-runner with the method main to run the program.
 * Request the job code from the console and display the job title on the screen.*/
public class Runner {

    public static void main(String[] args) {
        Director director = new Director();
        Employee employee = new Employee();
        Accountant accountant = new Accountant();

        System.out.println("Enter position code from 1 to 3");
        Scanner scan = new Scanner(System.in);
        int posit = scan.nextInt();

        if(posit == director.positionNumber){
            director.showPositionName();
        } else if (posit == employee.positionNumber){
            employee.showPositionName();
        } else if (posit == accountant.positionNumber) {
            accountant.showPositionName();
        } else {
            System.out.println("Incorrect position number");
        }
    }

}
