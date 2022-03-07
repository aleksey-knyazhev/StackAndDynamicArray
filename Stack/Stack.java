public class Stack {
    private Element topElement = null;

    public boolean empty() {
        return topElement == null;
    }

    public void push(String value) {
        Element newElement = new Element();
        newElement.value = value;
        if (empty()) {
            topElement = newElement;
            return;
        }
        newElement.next = topElement;
        topElement.previous = newElement;
        topElement = newElement;
    }

    public String pop() {
        if (empty())
            return null;

        String result = topElement.value;
        topElement = topElement.next;
        if (!empty())
            topElement.previous = null;
        return result;
    }
}
