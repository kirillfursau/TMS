package homeWork.homeWork4;

import java.util.Scanner;

public class Сompucter {
    String processor;
    String randomAccessMemory;
    String drive;
    int resource;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    Сompucter() {
        System.out.print("Enter processor : ");
        this.processor = sc.nextLine();
        System.out.print("Enter RAM : ");
        this.randomAccessMemory = sc.nextLine();
        System.out.print("Enter drive : ");
        this.drive = sc.nextLine();
        System.out.println("Enter resource : ");
        this.resource = sc.nextInt();
    }

    void printCompInformation() {
        System.out.println("Processor is " + processor);
        System.out.println("RAM is " + randomAccessMemory);
        System.out.println("Disk is " + drive);
        System.out.println("My resource is " + resource);
    }

    void turnOff() {
        int i = (int) (Math.random() * 2);
        System.out.print("I want to turn off. Enter number : ");
        int yrNumber = sc.nextInt();
        if (yrNumber <= 1) {
            if (yrNumber == i) {
                count++;
                System.out.println("I am turn off.");
                if (count == resource) {
                    System.out.print("I am out of resource. ");
                    count = 0;
                    fire();
                }
            } else {
               fire();
            }
        } else {
            System.out.println("I need 1 or 0.");
            turnOff();
        }
    }

    void turnOn() {
        int i = (int) (Math.random() * 2);
        System.out.print("I want to turn on. Enter number : ");
        int yrNumber = sc.nextInt();
        if (yrNumber <= 1) {
            if (yrNumber == i) {
                System.out.println("I am turn on.");
            } else {
               fire();
            }
        } else {
            System.out.println("I need 1 or 0.");
            turnOn();
        }
    }

    void fire() {
        System.out.println("I'm on fire. Try again");
        boolean fire = false;
    }
}
