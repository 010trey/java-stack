import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                // Attempt to cast the element to an Integer
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                // Handle the exception and print error details
                System.out.println("Error at index " + i + ": " + e.getMessage());
                System.out.println("Value causing the error: " + myList.get(i));
            }
        }
    }
}
