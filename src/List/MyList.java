package List;

import java.util.Arrays;

public class MyList<T> {
    private T[] myList = (T[]) new Object[1000];
    int index = 0;

    public void add(T t) {
        if (index > myList.length - 1)
            myList = Arrays.copyOf(myList, index * 2);
        myList[index++] = t;
    }

    public void remove(int index) {
        for (int i = index; i < this.index; i++) {
            myList[i] = myList[i + 1];
        }
        this.index--;
    }

    public void remove(T t) {
        int j = index;
        for (int i = 0; i < index; i++) {
            if (myList[i] == t) {
                j = i;
            }
        }

            for (int z = j; z < index; z++) {
                myList[index] = myList[index + 1];
            }
            index--;

    }

    public T[] getMyList() {
        return myList;
    }

    public T getByIndex(int index){

        return myList[index];
    }
}
