public class DinamicArrayElement {
    public Object value = null;
    public DinamicArrayElement next = null;
    public DinamicArrayElement previous = null;

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(DinamicArrayElement next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public DinamicArrayElement getNext() {
        return next;
    }
}

/* Почему я смог все сделать не используя сеттеры, геттеры?
И как правильно? */