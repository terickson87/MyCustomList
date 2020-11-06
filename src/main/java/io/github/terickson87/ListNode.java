package io.github.terickson87;

public class ListNode<T> {
   private ListNode<T> next;
   private ListNode<T> prev;
   private T data;

   public ListNode() {
      this.next = null;
      this.prev = null;
      this.data = null;
   }

   public ListNode(T data) {
      this.next = null;
      this.prev = null;
      this.data = data;
   }

   public ListNode(ListNode<T> next, ListNode<T> prev, T data) {
      this.next = next;
      this.prev = prev;
      this.data = data;
   }

   public boolean hasNext() {
      return this.next != null;
   }

   public boolean hasPrev() {
      return this.prev != null;
   }

   public boolean isNull() {
      return this.data == null;
   }

   public ListNode<T> getNext() {
      return next;
   }

   public void setNext(ListNode<T> next) {
      this.next = next;
   }

   public ListNode<T> getPrev() {
      return prev;
   }

   public void setPrev(ListNode<T> prev) {
      this.prev = prev;
   }

   public T getData() {
      return data;
   }

   public void setData(T data) {
      this.data = data;
   }
   
}
