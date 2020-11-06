package io.github.terickson87;

import java.util.Iterator;

public class MyCustomListIterator<T> implements Iterator<ListNode<T>> {
   private ListNode<T> current;

   public MyCustomListIterator(ListNode<T> node) {
      current = node;
   }

   @Override
   public boolean hasNext() {
      return current != null;
   }

   @Override
   public ListNode<T> next() {
      ListNode<T> currentReturn = current;
      current = current.getNext();
      return currentReturn;
   }

   
   
}
