public class Element {
    public String value = null;
    public Element next = null;


    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }
}

/* Почему я смог все сделать не используя сетеры, геттеры?
И как правильно? */