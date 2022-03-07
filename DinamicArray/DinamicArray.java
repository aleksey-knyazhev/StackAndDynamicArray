public class DinamicArray {
    private DinamicArrayElement topElement = null;

    public boolean empty() {
        return topElement == null; // Почему equals не отработало, в данном случае?
    }

    public void push(String value) {
        DinamicArrayElement newElement = new DinamicArrayElement();
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