public class DynamicArray {
    private DynamicArrayElement topElement = null;
    private DynamicArrayElement bottomElement = null;
    private int count = 0;

    public boolean empty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void clear() {
        topElement = null;
        bottomElement = null;
        count = 0;
    }

    public void add(String value) {
        DynamicArrayElement newElement = new DynamicArrayElement(value);
        if (topElement == null) {
            topElement = newElement;
            bottomElement = newElement;
        } else {
            bottomElement.setNext(newElement);
            bottomElement = newElement;
        }
        count++;
    }

    public void add(String value, int index) {
        if (index >= count - 1) {
            add(value);
            return;
        }

        DynamicArrayElement newElement = new DynamicArrayElement(value);
        DynamicArrayElement oldElement = topElement;
        for (int i = 0; i <= index; i++) {
            oldElement = oldElement.getNext();
        }

        newElement.setNext(oldElement.getNext());
        oldElement.setNext(newElement);
        count++;
    }

    public String get(int index) {
        if (index >= count - 1) {
            return bottomElement.getValue();
        }

        DynamicArrayElement foundElement = topElement;
        for (int i = 0; i <= index - 1; i++) {
            foundElement = foundElement.getNext();
        }
        return foundElement.getValue();
    }

    public void remove(int index) {
        DynamicArrayElement foundElement = topElement;
        DynamicArrayElement previousElement = null;
        for (int i = 0; i < index || !foundElement.equals(bottomElement); i++) {
            previousElement = foundElement;
            foundElement = foundElement.getNext();
        }
        count--;

        if (!foundElement.equals(bottomElement))
            previousElement.setNext(foundElement.getNext());

        previousElement.setNext(null);
        bottomElement = previousElement;
    }

    public void print() {
        DynamicArrayElement foundElement = topElement;
        for (int i = 0; i <= count - 1; i++) {
            System.out.printf("i: " + i + ", value: " + foundElement.getValue() + "\n");
            foundElement = foundElement.getNext();
        }
        System.out.printf("\n");
    }
}