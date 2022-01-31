package BigTask;

import java.util.ArrayList;

public class Box<T extends Fruits> {

    private ArrayList<T> arrListBox;
    private int countInBox = 0;


    public float getWeight() {
        float weight = 0.0f;
        if (arrListBox != null || countInBox != 0) {
            for (T listBox : arrListBox) {
                weight += listBox.getWeight();
            }
            return weight;
        } else {
            return 0.0f;
        }
    }

    public boolean compareBox(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void shiftFruitsToAnotherBox(Box<T> anotherBox) {
        for (T listBox : arrListBox) {
            anotherBox.addFruitToBox(listBox);
        }
        arrListBox.clear();
        countInBox = 0;
    }

    public void addFruitToBox(T fruit) {
        if (arrListBox == null) {
            arrListBox = new ArrayList<>();
            arrListBox.add(fruit);
            countInBox++;

        } else {
            arrListBox.add(fruit);
            countInBox++;

        }

    }


}
