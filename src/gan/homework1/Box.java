package gan.homework1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> arrayList;

    public Box() {
        arrayList = new ArrayList<>();
    }

    float maxWeight = 5.0f;

    //Добавляем фрукты в коробку
    void addFruitToBox(T fruit) {
        if (getWeight() + (float) fruit.getWeight() < maxWeight) {
            arrayList.add(fruit);
        } else {
            System.out.println("Коробка полностью заполнена");
        }
    }

    //Получаем вес коробки
    float getWeight() {
        if (arrayList.isEmpty()) {
            return 0;
        } else {
            return arrayList.size() * (float) arrayList.get(0).getWeight();
        }
    }

    //Сравниваем вес двух коробок
    boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    //Переносим фрукты из одной коробки в другую
    void moveFruit(Box<T> box) {
        int count = this.arrayList.size();
        for (int i = 0; i < count; i++) {
            box.addFruitToBox(this.arrayList.get(i));
        }
        this.arrayList.clear();
    }
}


