package collections;

public class GenericDisplay<T> {

    private T element;

    public GenericDisplay(T element) {
        this.element = element;
    }

    
    public T display() {
        // System.out.println("Element: " + element);
        // System.out.println("Data Type: " + element.getClass().getName());
        return element;
    }

    public static void main(String[] args) {
    
        GenericDisplay<String> stringDisplay = new GenericDisplay<>("hello");
        // stringDisplay.display();
        System.out.println(        stringDisplay.display());

       GenericDisplay<Double> doubleDisplay = new GenericDisplay<>(12.13);
       System.out.println( doubleDisplay.display());

    }
}
