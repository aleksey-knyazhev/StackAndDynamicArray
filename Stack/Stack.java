public class Stack {
    private StackElement topElement = null;

    public boolean empty() {
        return topElement == null;
    }

    public void push(String value) {
        StackElement newElement = new StackElement();
        newElement.value = value;
        if (empty()) {
            topElement = newElement;
            return;
        }
        newElement.next = topElement;
        topElement = newElement;
    }

    public String pop() {
        if (empty())
            return null;

        String result = topElement.value;
        topElement = topElement.next;
        return result;
    }
}
