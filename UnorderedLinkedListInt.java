public class UnorderedLinkedListInt extends LinkedListIntClass {

   public int findSum() {
       int sum = 0;
       Node temp = head;
       while(temp!=null){
           sum+=temp.data;
           temp = temp.next;
       }
       return sum;
   }

   public int findMin() {
       int min = head.data;
       Node temp = head;
       while(temp!=null){
           if(temp.data<min){
               min = temp.data;
           }
           temp = temp.next;
       }
       return min;
   }

   @Override
   public String toString() {
       String returnMe = "[";
       Node temp = head;
       while(temp!=null){
           if(temp==head)
               returnMe+=temp.data;
           else
               returnMe+=","+temp.data;  
           temp = temp.next;
       }
       returnMe+=']';
       return returnMe;
   }

}