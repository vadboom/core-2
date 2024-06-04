package task.generics;

import java.util.ArrayList;
import java.util.List;

import task.models.BigBox;
import task.models.MediumBox;
import task.models.MicroBox;
import task.models.SmallBox;

public class Generics<T extends BigBox> {



    public static void main(String[] args) {
        List<BigBox> Producer=new ArrayList<>();
        Producer.add(generateBigBox());
        Producer.add(generatMicroBox());
        Producer.add(generatSmallBox());
        Producer.add(generateMediumBox());
        List<BigBox> Consumer=new ArrayList<>();
        Consumer.add(generateBigBox());
        Consumer.add(generatMicroBox());
        Consumer.add(generatSmallBox());
        Consumer.add(generateMediumBox());
        System.out.println(Consumer);
        System.out.println(Producer);
        Generics generics = new Generics();
        System.out.println(generics.checkBoxInList(Consumer,generateMediumBox()));
        generics.addBoxToList(Consumer,generateMediumBox());
        generics.printBoxList(Consumer);
        generics.copyBoxes(Consumer,Producer);
    }
        //TODO: реализуйте Метод для проверки наличия коробки в списке (Producer)
        public boolean checkBoxInList(List<T> listBox, T t) {
        return listBox.contains(t);
        }
        //TODO: реализуйте Метод для добавления коробок в список (Consumer)
        public void addBoxToList(List<T> listBox, T t){
            listBox.add(t);
        }
        //TODO: реализуйте Метод для печати списка коробок (Producer)
        public void printBoxList(List<T> listBox) {
            System.out.println(listBox);
        }
        //TODO: реализуйте Метод для копирования коробок из одного списка в другой (Producer и Consumer)
        public void copyBoxes(List<T> listBox,List<T> listBox2){
            listBox.addAll(listBox2);
        }


    private static BigBox generateBigBox() {
        BigBox bigBox = new BigBox();
        bigBox.setMediumBox(generateMediumBox());
        bigBox.setHeight(20);
        bigBox.setLength(20);
        bigBox.setSize("big");
        bigBox.setWidth(20);
        return bigBox;
    }

    private static MediumBox generateMediumBox() {
        MediumBox mediumBox = new MediumBox();
        mediumBox.setSmallBox(generatSmallBox());
        mediumBox.setHeight(15);
        mediumBox.setLength(15);
        mediumBox.setSize("medium");
        mediumBox.setWidth(15);
        return mediumBox;
    }

    private static SmallBox generatSmallBox() {
        SmallBox smallBox = new SmallBox();
        smallBox.setMicroBox(generatMicroBox());
        smallBox.setHeight(10);
        smallBox.setLength(10);
        smallBox.setSize("small");
        smallBox.setWidth(10);
        return smallBox;
    }

    private static MicroBox generatMicroBox() {
        MicroBox microBox = new MicroBox();
        microBox.setHeight(5);
        microBox.setLength(5);
        microBox.setSize("small");
        microBox.setWidth(5);
        return microBox;
    }





}