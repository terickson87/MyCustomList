package io.github.terickson87;

import java.util.Iterator;

public class MyCustomList<T> implements Iterable<ListNode<T>> {
   private ListNode<T> first;
   private ListNode<T> last;
   private int numberOfElements;

   public MyCustomList() {
      this.first = null;
      this.last = null;
      this.numberOfElements = 0;
   }

   public boolean isEmpty() {
      return first == null;
   }

   public void pushFront(T element) {
      if (isEmpty()) {
         pushEmpty(element);
      } else {
         ListNode<T> newNode = new ListNode<>(element);
         newNode.setNext(first);
         first.setPrev(newNode);
         first = newNode;
      }
      numberOfElements++;
   }

   public void pushBack(T element) {
      if (isEmpty()) {
         pushEmpty(element);
      } else {
         ListNode<T> newNode = new ListNode<>(element);
         newNode.setPrev(last);
         last.setNext(newNode);
         last = newNode;
      }
      numberOfElements++;
   }

   public ListNode<T> popFront() {
      if (isEmpty()) {
         return null;
      } else {
         ListNode<T> frontNode = first;
         first = frontNode.getNext();
         first.setPrev(null);
         frontNode.setNext(null);
         numberOfElements--;
         return frontNode;
      }
   }

   public ListNode<T> popBack() {
      if (isEmpty()) {
         return null;
      } else {
         ListNode<T> backNode = last;
         last = backNode.getPrev();
         last.setNext(null);
         backNode.setPrev(null);
         numberOfElements--;
         return backNode;
      }
   }

   public T peekFront() {
      return first.getData();
   }

   public T peekBack() {
      return last.getData();
   }

   public int size() {
      return this.numberOfElements;
   }

   private void pushEmpty(T element) {
      this.first = new ListNode<>(element);
      this.last = this.first;
   }

   @Override
   public Iterator<ListNode<T>> iterator() {
      return new MyCustomListIterator<>(first);
   }
   
}
