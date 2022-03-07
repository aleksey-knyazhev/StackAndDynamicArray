public class Element {
    public String value = null;
    public Element previous = null;
    public Element next = null;

    public void setValue(String value) {
        this.value = value;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
