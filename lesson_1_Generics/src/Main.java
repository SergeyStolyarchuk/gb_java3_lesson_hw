import BigTask.Apple;
import BigTask.Box;
import BigTask.Orange;

public class Main {

    public static void main(String[] args) {

        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrStr = {"one", "two", "three", "four", "five"};

        ArrayGeneric genInt = new ArrayGeneric(arrInt);
        ArrayGeneric genStr = new ArrayGeneric(arrStr);
        genInt.printArray();
        genStr.printArray();
        genInt.moveElement(1, 3);
        genStr.moveElement(2, 3);
        System.out.println("Выводим как ArrayList " + genInt.arrToArrayList());

        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox = new Box();
        Box<Orange> orangeBox1 = new Box();

        appleBox.addFruitToBox(new Apple());
        appleBox.addFruitToBox(new Apple());
        appleBox.addFruitToBox(new Apple());
        orangeBox.addFruitToBox(new Orange());
        orangeBox.addFruitToBox(new Orange());
        orangeBox.addFruitToBox(new Orange());
        orangeBox.addFruitToBox(new Orange());
        orangeBox1.addFruitToBox(new Orange());
        System.out.println();
        System.out.println("Вес коробки с яблоками - " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами - " + orangeBox.getWeight());
        System.out.println("Вес коробки с апельсинами1 - " + orangeBox1.getWeight());
        System.out.println();
        System.out.println("Сравниваем вес коробок с яблоками и апельсинами " + appleBox.compareBox(orangeBox));
        System.out.println();
        System.out.println("Пересыпаем апельсины из одной коробки в другую");
        orangeBox.shiftFruitsToAnotherBox(orangeBox1);
        System.out.println("Вес коробки с апельсинами - " + orangeBox.getWeight());
        System.out.println("Вес коробки с апельсинами1 - " + orangeBox1.getWeight());
    }
}