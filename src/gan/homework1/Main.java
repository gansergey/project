package gan.homework1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        Integer[] intArr = {1, 48, 35, 94, 5, 6};
        String[] strArr = {"A", "B", "С", "D"};

        replaceArrEl(intArr, 3, 0);
        replaceArrEl(strArr, 1, 2);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));

        //2. Написать метод, который преобразует массив в ArrayList
        List<String> arrayList = Arrays.asList(strArr.clone());
        System.out.println(arrayList);

        //3. Задача
        Apple apple = new Apple(); //Создаём яблоко
        Orange orange = new Orange(); //Создаём апельсин

        //Создаём коробки
        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();

        Box<Apple> appleBox2 = new Box<Apple>();

        //Заполняем коробки яблоками
        appleBox.addFruitToBox(apple);
        appleBox.addFruitToBox(apple);
        appleBox.addFruitToBox(apple);
        //appleBox.addFruitToBox(orange);//Не сработает по заданию

        orangeBox.addFruitToBox(orange);
        orangeBox.addFruitToBox(orange);
        orangeBox.addFruitToBox(orange);

        //Получаем вес коробки
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());

        //Сравниваем вес двух коробок
        System.out.println(appleBox.compare(orangeBox));

        //Пересыпаем фрукты из одной коробки в другую
        appleBox.moveFruit(appleBox2);
        //appleBox.moveFruit(orangeBox);//не сработает по заданию
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());
    }

    static <T> void replaceArrEl(T[] arr, int index, int index1) {
        T x = arr[index];
        arr[index] = arr[index1];
        arr[index1] = x;
    }
}
