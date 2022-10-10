import java.util.*;
public abstract class LinkedListIntClass implements LinkedListIntADT {
   class Node{
       int data;
       Node next;
       public Node(int data) {
           super();
           this.data = data;
           this.next = null;
       }
      
   }
   Node head,tail;
   @Override
   public boolean isEmptyList() {
       if(head==null){
           return true;
       }
       return false;
   }

   @Override
   public void initializeList() {
       head = null;
       tail = null;
   }

   @Override
   public void print() {
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
   }

   @Override
   public int length() {
       int count = 0;
       Node temp = head;
       while(temp!=null){
           count++;
           temp = temp.next;
       }
       return count;
   }

   @Override
   public int front() {
       if(head!=null){
           return head.data;
       }
       return 0;
   }

   @Override
   public int back() {
       if(tail!=null){
           return tail.data;
       }
       return 0;
   }

   @Override
   public boolean search(int searchItem) {
       Node temp = head;
       while(temp!=null){
           if(temp.data==searchItem){
               return true;
           }
           temp = temp.next;
       }
       return false;
   }

   @Override
   public void insertFirst(int newItem) {
       Node newNode = new Node(newItem);
       if(head==null){
           head = newNode;
           tail = newNode;
       }else{
           newNode.next = head.next;
           head = newNode;
       }
   }

   @Override
   public void insertLast(int newItem) {
       Node newNode = new Node(newItem);
       if(head==null){
           head = newNode;
           tail = newNode;
       }else{
           tail.next = newNode;
           tail = newNode;
       }
   }

   @Override
   public void deleteNode(int deleteItem) {
       if(head==null){
           return;
       }else if(head.data==deleteItem){
           head =head.next;
       }else{
           Node temp = head;
           Node prev=null;
           while(temp!=null){
               if(temp.data==deleteItem){
                   prev.next = temp.next;
               }
               prev = temp;
               temp = temp.next;
           }
      
       }
   }
  
}