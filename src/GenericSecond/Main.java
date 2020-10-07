package GenericSecond;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample1);

//        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
//        list1.add(sample1);
//        list1.add(sample2);
        // из-за несоответствия параметров экземпляров класса Box и ArrayList невозможно добавить объекты в список

        ArrayList<Box<String, String>> list1 = new ArrayList<>();
        list1.add(sample1);


        ArrayList<Box<Integer, Boolean>> list = new ArrayList<>();
        list.add(sample2);
    }
}
