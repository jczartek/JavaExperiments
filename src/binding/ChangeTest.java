package binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;


public class ChangeTest {
    public static void main(String[] args) {
        IntegerProperty counter = new SimpleIntegerProperty(100);
        ChangeListener<Number> listener = (p, oldValue, newValue) -> {
            System.out.print("Counter changed: ");
            System.out.println("Old = " + oldValue + ", new = " + newValue);
        };
        counter.addListener(listener);

        System.out.println("\nBefore changing the counter value-1");
        counter.set(101);
        System.out.println("After changing the counter value-1");
        System.out.println("\nBefore changing the counter value-2");
        counter.set(102);
        System.out.println("After changing the counter value-2");

        System.out.println("\nBefore changing the counter value-3");
        counter.set(102); // No change event is fired.
        System.out.println("After changing the counter value-3");

        System.out.println("\nBefore changing the counter value-4");
        counter.set(103);
        System.out.println("After changing the counter value-4");

        counter.removeListener(listener);
    }
}
