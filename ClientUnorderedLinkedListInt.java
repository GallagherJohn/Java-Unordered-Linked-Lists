/* John Gallagher
 * Towson University 
 * 
 * Java program that saves user input in the form of an unordered linked list. 
 * The user can then choose to view, modify, change and manipulate items from the list.
 * After inserting values into list, the user can check the lists length, first and last
 * element, sum of elements, min and max values. USer can also search for elemets in list
 * and delete elements within the list. 
 * 
 * For any quetions please email jgalla17@students.towson.edu 
 */

import java.util.*;

public class ClientUnorderedLinkedListInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      UnorderedLinkedListInt intList = new UnorderedLinkedListInt();
      UnorderedLinkedListInt tempList;
      int num;
      System.out.println("Enter integers (999 to stop)");
      // accept list on integers from user
      if (input.hasNextInt()) {
        num = input.nextInt();
      }
      // input validation
      else {
        System.out.println("Number must be an integer!");

        num = input.nextInt();
      }
      // confirm user wants to ente rmore numbers into list
      while (num != 999) {
        intList.insertLast((Integer) num);
        num = input.nextInt();// valid??
      }
      // Test abstract data types
      System.out.print("\nTesting .insertLast and .print. The original list is: ");
      intList.print();
      System.out.println("\nTesting .length. The length of the list is: " + intList.length());
      if (!intList.isEmptyList()) {
        System.out.println("Testing .front. First element/list: " + intList.front());
        System.out.println("Testing .back. Last element/list: " + intList.back());
      }
      System.out.println("Testing .sum. The sum of data in all nodes is: " + intList.findSum());
      System.out.println("Testing .min. The smallest data in all nodes is: " + intList.findMin());
      System.out.println("Testing .search. Enter the number to search for within the list: ");
      num = input.nextInt(); // valid??
      if (intList.search(num))
        System.out.println(num + " found in this list.");
      else
        System.out.println(num + " is not in this list.");
      System.out.print("Testing .remove. Enter the number to be deleted from list: ");
      num = input.nextInt();// valid??
      intList.deleteNode(num);
      System.out.print("Testing .toString. After deleting " + num + ", the list is: " + intList);
      System.out.println("\nThe length of the list after delete is: " + intList.length());

    } catch (InputMismatchException e) {
      System.out.println("Input error. Please only enter integers!");
    }
  }
}