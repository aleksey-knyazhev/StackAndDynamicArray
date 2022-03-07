public class ExtendableArrayElement {
    public String value = null;
    public ExtendableArrayElement next = null;

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(ExtendableArrayElement next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public ExtendableArrayElement getNext() {
        return next;
    }
}

/* Почему я смог все сделать не используя сеттеры, геттеры?
И как правильно? */