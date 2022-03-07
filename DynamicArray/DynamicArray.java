public class DynamicArray {
    private DynamicArrayElement topElement = null;

    public boolean empty() {
        return topElement == null;
    }

    public void push(String value) {
        DynamicArrayElement newElement = new DynamicArrayElement();
        newElement.value = value;
        if (empty()) {
            topElement = newElement;
            return;
        }
        newElement.next = topElement;
        topElement = newElement;
    }

    public Object pop() {
        if (empty())
            return null;

        Object result = topElement.value;
        topElement = topElement.next;
        return result;
    }
}