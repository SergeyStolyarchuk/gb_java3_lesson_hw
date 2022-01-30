package BigTask;

import java.util.ArrayList;

public class Box <T extends Fruits>{

    private ArrayList<T> arrListBox;
    private int countInBox = 0;
    private String typeOfFruit;

    public float getWeight(){
        if (!(arrListBox == null || countInBox == 0)) {
            return arrListBox.get(0).getWeight() * countInBox;
        } else {
            return 0.0f;
        }
    }

    public boolean compareBox (Box anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void shiftFruitsToAnotherBox(Box anotherBox) {
        if (anotherBox.getTypeOfFruit().equals(typeOfFruit)){
            for (T listBox : arrListBox) {
                anotherBox.addFruitToBox(listBox);
            }
            arrListBox.clear();
            countInBox = 0;
        } else {
            System.out.println("Несовместимые коробки");
        }
    }

    public void addFruitToBox (T fruit) {
        if (arrListBox == null) {
            arrListBox = new ArrayList<>();
            arrListBox.add(fruit);
            countInBox++;
            typeOfFruit = arrListBox.get(0).getType();
        } else {
            arrListBox.add(fruit);
            countInBox++;
            typeOfFruit = arrListBox.get(0).getType();
        }

    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }
}
