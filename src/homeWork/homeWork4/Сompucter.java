package homeWork.homeWork4;

import java.util.Scanner;

public class Сompucter {
    String processor;
    String randomAccessMemory;
    String disk;
    int resource;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    Сompucter() {
        System.out.print("Enter processor : ");
        this.processor = sc.nextLine();
        System.out.print("Enter RAM : ");
        this.randomAccessMemory = sc.nextLine();
        System.out.print("Enter disk : ");
        this.disk = sc.nextLine();
        System.out.println("Enter resource : ");
        this.resource = sc.nextInt();
    }

    void printCompInformation() {
        System.out.println("Processor is " + processor);
        System.out.println("RAM is " + randomAccessMemory);
        System.out.println("Disk is " + disk);
        System.out.println("My resource is " + resource);
    }

    void turnOff() {
        int i = (int) (Math.random() * 2);
        System.out.print("I want to turn off. Enter number : ");
        int yrNumber = sc.nextInt();
        if (yrNumber <= 1) {
            if (yrNumber == i && resource - 1 != count) {
                count++;
                turnOn();
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
            if (yrNumber == i && resource - 1 != count) {
                count++;
                turnOff();
            } else {
                fire();
            }
        } else {
            System.out.println("I need 1 or 0.");
            turnOn();
        }
    }

    void fire() {
        System.out.println("I'm on fire");

    }
}
