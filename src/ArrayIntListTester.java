//Group 5:
//Kamil Peza & Yohannes Berhane
//Project 1 CUS1151
//Tester class for methods 1-9

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayIntListTester {
	
	public static void main(String[] args) {	
//method 1: maxCount
		ArrayList <Integer> List1 = new ArrayList <Integer>();
		List1.add(1);
		List1.add(3);
		List1.add(4);
		List1.add(7);
		List1.add(7);
		List1.add(7);
		List1.add(7);
		List1.add(9);
		List1.add(9);
		List1.add(11);
		List1.add(13);
		List1.add(14);
		List1.add(14);
		List1.add(14);
		List1.add(16);
		List1.add(16);
		List1.add(18);
		List1.add(19);
		List1.add(19);
		List1.add(19); 
		System.out.println("Method 1: ");
		System.out.println(List1);
		System.out.println("The max number of duplicate is: " + ArrayIntList.maxCount(List1));
		System.out.println("----------------------------------------------------------------------------------");
//method 2: longestSortedSequence
		ArrayList <Integer> List2 = new ArrayList <Integer>();
		List2.add(1);
		List2.add(3);
		List2.add(5);
		List2.add(2);
		List2.add(9);
		List2.add(7);
		List2.add(-3);
		List2.add(0);
		List2.add(42);
		List2.add(308);
		List2.add(17);
		System.out.println("Method 2: ");
		System.out.println(List2);
		System.out.println("The longest Sorted Sequence is: " + ArrayIntList.longestSortedSequence(List2));
		System.out.println("----------------------------------------------------------------------------------");
//method 3: runningTotal	
		ArrayList <Integer> List3 = new ArrayList <Integer>();
		List3.add(2);
		List3.add(3);
		List3.add(5);
		List3.add(4);
		List3.add(7);
		List3.add(15);
		List3.add(20);
		List3.add(7); 
		System.out.println("Method 3: ");
		System.out.println(List3);
		ArrayList <Integer> List4 = ArrayIntList.runningTotal(List3);
		System.out.println("Array List after running Total: " + List4);
		System.out.println("----------------------------------------------------------------------------------");
//method 4: isPairwiseSorted	
		ArrayList <Integer> List5 = new ArrayList <Integer>();
		List5.add(3);
		List5.add(8);
		List5.add(2);
		List5.add(5);
		List5.add(19);
		List5.add(24);
		List5.add(-3);
		List5.add(0);
		List5.add(4);
		List5.add(4);
		List5.add(8);
		List5.add(205);
		List5.add(42);	
		System.out.println("Method 4: ");
		System.out.print(List5);
		System.out.println(" Is the list pair-wise sorted: " + ArrayIntList.isPairwiseSorted(List5));
		System.out.println("----------------------------------------------------------------------------------");
//method 5: copyStack		
		Stack<Integer> Stack1 = new Stack <Integer>();
		Stack1.push(3);
		Stack1.push(4);
		Stack1.push(6);
		Stack1.push(11);
		Stack1.push(16);
		Stack1.push(22);
		System.out.print("Method 5: " );
		System.out.println("Stack 1: " + Stack1);
		Stack<Integer> Stack2 = ArrayIntList.copyStack(Stack1);
		System.out.println("Copy of Stack 1 becomes Stack 2: " + Stack2);
		System.out.println("Stack 1 after being copied: " + Stack2);
		System.out.println("----------------------------------------------------------------------------------");
//method 6: equals	
		Stack<Integer> Stack3 = new Stack <Integer>();
		Stack3.push(3);
		Stack3.push(4);
		Stack3.push(6);
		Stack3.push(11);
		Stack3.push(16);
		Stack3.push(22);
		System.out.println("Method 6: ");
		System.out.println("Stack 1: " + Stack1);
		System.out.println("Stack 3: " + Stack3);
		System.out.println("Is Stack1 and Stack3 equal?: " + ArrayIntList.equals(Stack1, Stack3));
		System.out.println("----------------------------------------------------------------------------------");
//method 7: rearrange
		Queue <Integer> Queue1 = new LinkedList<Integer>();
		Queue1.add(3);
		Queue1.add(5);
		Queue1.add(4);
		Queue1.add(17);	
		Queue1.add(6);
		Queue1.add(83);
		Queue1.add(1);
		Queue1.add(84);
		Queue1.add(16);
		Queue1.add(37);
		System.out.println("Method 7:");
		System.out.println("Queue 1: " + Queue1);
		System.out.println("Queue 1 rearranged: " + ArrayIntList.rearrange(Queue1));
		System.out.println("----------------------------------------------------------------------------------");
//method 8: isPalindrome
		Queue <Integer> Queue2 = new LinkedList<Integer>();
		Queue2.add(3);
		Queue2.add(8);
		Queue2.add(17);
		Queue2.add(9);
		Queue2.add(17);
		Queue2.add(8);
		Queue2.add(3);	
		System.out.println("Method 8:");
		System.out.println("Queue2 is: " + Queue2);
		System.out.println("Is Queue2 a Palindrome?: " + ArrayIntList.isPalindrome(Queue2));
		System.out.println("----------------------------------------------------------------------------------");
//method 9: shift
		Stack<Integer> Stack4 = new Stack <Integer>();
		Stack4.push(1);
		Stack4.push(2);
		Stack4.push(3);
		Stack4.push(4);
		Stack4.push(5);
		Stack4.push(6);
		Stack4.push(7);
		Stack4.push(8);
		Stack4.push(9);
		Stack4.push(10);
		System.out.println("Method 9: ");
		System.out.println("Stack 4: " + Stack4);
		System.out.println("Stack 4 with a shift of 6 is: " + ArrayIntList.shift(Stack4, 6));
		System.out.println("Stack after shift is: " + Stack4);
	}//end of the main method

}//end of Tester class
