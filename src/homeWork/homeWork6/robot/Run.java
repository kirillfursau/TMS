package homeWork.homeWork6.robot;

import homeWork.homeWork6.robot.hands.SamsungHand;
import homeWork.homeWork6.robot.hands.SonyHand;
import homeWork.homeWork6.robot.hands.ToshibaHand;
import homeWork.homeWork6.robot.heads.SamsungHead;
import homeWork.homeWork6.robot.heads.SonyHead;
import homeWork.homeWork6.robot.heads.ToshibaHead;
import homeWork.homeWork6.robot.legs.SamsungLeg;
import homeWork.homeWork6.robot.legs.SonyLeg;
import homeWork.homeWork6.robot.legs.ToshibaLeg;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungHand samsungHand = new SamsungHand(1);
        SonyHand sonyHand = new SonyHand(0);
        ToshibaHand toshibaHand = new ToshibaHand(1);
        SamsungHead samsungHead = new SamsungHead(1);
        SonyHead sonyHead = new SonyHead(0);
        ToshibaHead toshibaHead = new ToshibaHead(1);
        SamsungLeg samsungLeg = new SamsungLeg(1);
        SonyLeg sonyLeg = new SonyLeg(1);
        ToshibaLeg toshibaLeg = new ToshibaLeg(0);
        Robot robot = new Robot(samsungHead, samsungHand, sonyLeg);
        Robot robot1 = new Robot(sonyHead, sonyHand, toshibaLeg);
        Robot robot2 = new Robot(toshibaHead, toshibaHand, samsungLeg);
        robot.action();
        robot1.action();
        robot2.action();
        if (robot.getPrice() >= robot1.getPrice() && robot.getPrice() >= robot2.getPrice()) {
            System.out.println("First robot is expensive");
        } else if (robot1.getPrice() >= robot.getPrice() && robot1.getPrice() >= robot2.getPrice()) {
            System.out.println("Second robot is expensive");
        } else {
            System.out.println("Third robot is expensive");
        }
    }
}
