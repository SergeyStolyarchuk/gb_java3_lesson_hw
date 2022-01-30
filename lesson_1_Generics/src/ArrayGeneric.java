import java.util.Arrays;
import java.util.List;

public class ArrayGeneric<T> {
    private T[] arr;

    public ArrayGeneric(T array[]) {
        this.arr = array;

    }

    public T[] getArrays() {
        return arr;
    }

    public void moveElement (int index1, int index2) {
        int i1 = index1 - 1;
        int i2 = index2 - 1;

        if (index1 > 0 && index1 < index2 && index2 > index1 && index2 < arr.length) {
            T tempElementIndex = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = tempElementIndex;
            System.out.printf("поменяли местами элемент массива %s и %s %n", index1, index2);
            printArray();
        } else {
            System.out.println("Индексы выходят за размер массива");
        }

    }

    public List<T> arrToArrayList(){
        List<T> arrToList = Arrays.asList(arr);
        return arrToList;
    }

    public void printArray(){
        for (T t : arr) {
            System.out.print(t + ", ");
        }
        System.out.println();
    }
}
