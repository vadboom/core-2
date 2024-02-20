package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.

public class Student2 {
   private String name;
   private int attendance;

    public Student2(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }

    public static void minAttendance(List<Student2> students) {
        for (Student2 student2 : students) {
            if (student2.getAttendance() < 20) {
                System.out.println(student2);
            }
        }
    }

    public static int averageAttendance(List<Student2> stud) {
        int counter = 0;
        int result = 0;
        for (Student2 st : stud) {
            result += st.getAttendance();
            counter++;
        }
        return result / counter;
    }

    public static void main(String[] args) {
        Student2 st1 = new Student2("Akim", 50);
        Student2 st2 = new Student2("Vadim", 10);
        Student2 st3 = new Student2("Olia", 40);
        Student2 st4 = new Student2("Roma", 20);
        List<Student2> stud = new ArrayList<>();
        Collections.addAll(stud, st1, st2, st3, st4);
        Student2.minAttendance(stud);
        System.out.println(averageAttendance(stud));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}