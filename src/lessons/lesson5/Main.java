package lessons.lesson5;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Kirul", "Fursau", 21);
        Student st2 = new Student("Nikita", "Ivanov", 22);
        Student st3 = new Student("Maksim", "Petrov", 23);
        st1.printInformation();
        System.out.println(st1.getFullName("Mr. "));
        st2.doHomeWork(2);
        st1.doHomeWork(2);
        st3.doHomeWork(2);
        int[] homeWorkDone = st1.getHomeWorkDone();
        for (int i = 0; i < homeWorkDone.length; i++) {
            System.out.println(homeWorkDone[i]);
        }
        Group gr1 = new Group("java", 1);
        gr1.addStudent(st1);
        gr1.addStudent(st2);
        Group gr2 = new Group("Kotlin", 2);
        gr2.addStudent(st3);
        Student[] done = gr1.checkHomeWorks(2);
        for (int i = 0; i < done.length; i++) {
            System.out.println(done[i].getFullName());
        }
        st1.greet();
        Coach co1 = new Coach("Yauhen", "Parmon", 23, 1, gr2);
        co1.printInformation();
        Student[] coachDone = co1.checkHomeWork(2);
        for (int i = 0; i < coachDone.length; i++) {
            System.out.println(coachDone[i].getFullName());
        }
    }
}
