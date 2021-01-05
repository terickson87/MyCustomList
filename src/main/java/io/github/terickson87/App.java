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

        System.out.println("intList");
        for (ListNode<Integer> elem : intList) {
            System.out.println(elem.getData());
        }

        ListNode<Integer> temp = intList.popFront();
        System.out.println("intList - Popped front");
        System.out.println(temp.getData());
        temp = intList.popBack();
        System.out.println("intList - Popped back");
        System.out.println(temp.getData());

        System.out.println("intList - w/ Popped front and back");
        for (ListNode<Integer> elem : intList) {
            System.out.println(elem.getData());
        }

        MyCustomList<String> stringList = new MyCustomList<>();
        stringList.pushFront("B");
        stringList.pushBack("C");
        stringList.pushFront("A");
        stringList.pushBack("D");

        System.out.println("stringList");
        for (ListNode<String> elem : stringList) {
            System.out.println(elem.getData());
        }

        ListNode<String> temp2 = stringList.popFront();
        System.out.println("stringList - Popped front");
        System.out.println(temp2.getData());
        temp2 = stringList.popBack();
        System.out.println("stringList - Popped back");
        System.out.println(temp2.getData());
        
        System.out.println("stringList - w/ Popped front and back");
        for (ListNode<String> elem : stringList) {
            System.out.println(elem.getData());
        }
    }
}
