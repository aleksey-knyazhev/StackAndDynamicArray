public class DynamicArrayElement {
    public Object value = null;
    public DynamicArrayElement next = null;
    public DynamicArrayElement previous = null;

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(DynamicArrayElement next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public DynamicArrayElement getNext() {
        return next;
    }
}