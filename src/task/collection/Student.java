package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Создание списка студентов:
//  Создайте класс Student с полями name и age.
//  Создайте метод, который будет принимать список студентов и выводить их на экран.
//  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.
public class Student {
   private String name;
   private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void studentList(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static void studentAge(List<Student> list, int age) {
        for (Student student : list) {
            if (age < student.getAge()) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Roma", 25);
        Student student2 = new Student("Sveta", 27);
        Student student3 = new Student("Nickita", 35);
        Student student4 = new Student("Akim", 18);
        List<Student> students = new ArrayList<>();
        Collections.addAll(students,student1,student2,student3,student4);
        Student.studentList(students);
        Student.studentAge(students, 27);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}