package List;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("hello");
        myList.add("bye");
        myList.remove(0);
        System.out.println(myList.getByIndex(0));

    }
}
