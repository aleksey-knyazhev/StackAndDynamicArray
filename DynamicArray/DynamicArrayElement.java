public class DynamicArrayElement {
    public String value;
    public DynamicArrayElement next = null;

    public DynamicArrayElement(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(DynamicArrayElement next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public DynamicArrayElement getNext() {
        return next;
    }
}