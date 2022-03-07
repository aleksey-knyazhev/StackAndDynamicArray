public class Test {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.empty());
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        System.out.println(stack.pop());
        stack.push("test4");
        System.out.println(stack.pop());
        stack.push("test5");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
