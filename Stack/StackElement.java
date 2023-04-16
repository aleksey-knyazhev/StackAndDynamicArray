public class StackElement {
    public String value = null;
    public StackElement next = null;

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(StackElement next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public StackElement getNext() {
        return next;
    }
}
