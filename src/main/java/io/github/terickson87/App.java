package io.github.terickson87;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyCustomList<Integer> intList = new MyCustomList<>();
        intList.pushFront(1);
        intList.pushBack(2);
        intList.pushFront(0);
        intList.pushBack(3);

        MyCustomList<String> stringList = new MyCustomList<>();
        stringList.pushFront("B");
        stringList.pushBack("C");
        stringList.pushFront("A");
        stringList.pushBack("D");

        System.out.println("intList");
        for (ListNode<Integer> elem : intList) {
            System.out.println(elem.getData());
        }

        System.out.println("stringList");
        for (ListNode<String> elem : stringList) {
            System.out.println(elem.getData());
        }
    }
}
