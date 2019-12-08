package lessons.lesson5;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.printInformation();
        System.out.println(st1.getFullName("Mr. "));
        st1.doHomeWork(2);
        int[] homeWorkDone = st1.getHomeWorkDone();
        for (int i = 0; i < homeWorkDone.length; i++) {
            System.out.println(homeWorkDone[i]);
        }
        Group gr1 = new Group("java", 1);
        gr1.addStudent(st1);
        gr1.printGroupInformation();
        gr1.addGroup(gr1);
        Coach co1 = new Coach("Yauhen", "Parmon", 23, 1, 5);
        co1.printInformation();
        gr1.printGroupsInformation();
        gr1.printGroupInformation();
    }
}
