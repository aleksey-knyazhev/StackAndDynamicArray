public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.size());
        System.out.printf("" + dynamicArray.empty() + "\n");
        dynamicArray.add("test1");
        dynamicArray.add("test2");
        dynamicArray.add("test3");
        dynamicArray.print();
        dynamicArray.add("test4");
        dynamicArray.print();
        dynamicArray.remove(2);
        dynamicArray.print();
        System.out.println(dynamicArray.get(1));
        dynamicArray.add("test5", 1);
        dynamicArray.print();
        System.out.println(dynamicArray.size());
        System.out.printf("" + dynamicArray.empty() + "\n");
        dynamicArray.clear();
        dynamicArray.print();
        System.out.println(dynamicArray.size());
        System.out.printf("" + dynamicArray.empty() + "\n");
    }
}
