//Group 5:
//Kamil Peza & Yohannes Berhane
//Project 1 CUS1151
//Class with the code for methods 1-9

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayIntList {
//your methods
	
//method 1: maxCount
	public static int maxCount(ArrayList <Integer> AL){
		int duplicates = 1;
		int maxduplicates = 1;
		
		if(AL.isEmpty()){
			return maxduplicates=0;
		}
		for (int i=0; i<AL.size()-1; i++){
			
				if(AL.get(i).equals(AL.get(i+1))){
					//if there is a duplicate
					duplicates++;
					if(duplicates>maxduplicates){
						maxduplicates=duplicates;
					}
				}
				else if(!AL.get(i).equals(AL.get(i+1))){
					duplicates=1;
				}	
		}//end of all loops
		return maxduplicates;
	}//end of maxCount method
	
//method 2: longestSortedSequence
	public static int longestSortedSequence(ArrayList <Integer> List){
		int sortednum=1;
		int longestsorted=1;
		
		if(List.isEmpty()){
			return longestsorted=0;
		}
		for(int i=0; i<List.size()-1; i++){
			if(List.get(i)<List.get(i+1)){
				sortednum++;
				if(sortednum>longestsorted){
					longestsorted=sortednum;
				}
			}
			else if(!List.get(i).equals(List.get(i+1))){
				sortednum=1;
			}
		}
		return longestsorted;
	}//end of longestSortedSequence method
	
//method 3: runningTotal
	public static ArrayList<Integer> runningTotal(ArrayList <Integer> AL){
		ArrayList <Integer> running = new ArrayList();
		int sum= 0;
		if(AL.size()>0){
			for(int i=0; i<AL.size()-1; i++){
				if(running.isEmpty()){
					running.add(AL.get(i));
				}
				int x= AL.get(i+1);
				int y= running.get(i);
			 
			 sum=x+y;
			 running.add(sum);
			}
		}
		 return running;
	}//end of running total method
	
//method 4: isPairwiseSorted
	public static boolean isPairwiseSorted(ArrayList <Integer> AL){
		int ALsize= AL.size();
		
		if(ALsize<= 1){
			return true;
		}
		for(int i=0; i< ALsize;i+=2){
			if(ALsize%2 !=0){
				ALsize=ALsize-1;
			}	
			if(AL.get(i)> AL.get(i+1)){
				return false;
			}
		}
		return true;
	}//end of isPairwiseSorted
	
//method 5: copyStack
	public static Stack<Integer> copyStack(Stack<Integer> original){
		
		Queue <Integer> temp = new LinkedList<Integer>();
		Stack <Integer> copy = new Stack <Integer>();

		while(!original.empty()){
			copy.push(original.pop());
		}//end of for/while loop
		while(!copy.isEmpty()){
			int number = copy.pop();
			temp.add(number);
			original.push(number);
		}//end of while loop
		while(!temp.isEmpty()){
			copy.push(temp.remove());
		}//end of while loop
		return copy;
	}//end of copyStack
	
//method 6: equals
	public static boolean equals (Stack <Integer> Stk1, Stack <Integer> Stk2){
	
		int stacksize1= Stk1.size();
		int stacksize2= Stk2.size();
		
		if(stacksize1 !=stacksize2){//check if stacks have the same length
			return false;
		}
		Stack <Integer> temp = new Stack <Integer>(); //create temporary stack
		boolean Equality = true;
		
		while(!Stk1.isEmpty()){
			int pop1= Stk1.pop();
			int pop2= Stk2.pop();
			temp.push(pop1);
			temp.push(pop2);
			
			if(pop1!=pop2){
				Equality = false;
				break;
			}
		}	
		while(!temp.isEmpty()){
			Stk1.push(temp.pop());
			Stk2.push(temp.pop());
		}
		return Equality;
	}//end of equals method
	
//method 7: rearrange
	public static Queue<Integer> rearrange(Queue<Integer> Q) {
	    Stack<Integer> S = new Stack<Integer>();
	    int size = Q.size();
	            
	    for(int k = 0; k < 2; k++) {
	        for(int i = 0; i < size; i++) {
	            if(Q.peek() % 2 == 0)
	                Q.add(Q.remove());
	            else
	                S.push(Q.remove());
	        }
	        while(!S.isEmpty())
	            Q.add(S.pop());
	    }
	    return Q;
	}//end of rearrange method
	
//method 8: isPalindrome
	public static boolean isPalindrome(Queue<Integer> Q) {
	    Stack<Integer> S = new Stack<Integer>();
	    int size = Q.size();
	    boolean palindrome = true;
	                
	    for(int i = 0; i < size; i++) {
	        int n = Q.remove();
	        Q.add(n);
	        S.push(n);
	    }                                               
	    for(int i = 0; i < size; i++) {
	        int n1 = Q.remove();
	        int n2 = S.pop();
	        
	        if(n1 != n2)
	            palindrome = false;
	            
	        Q.add(n1);
	    }
	    return palindrome;
	}//end of isPalindrome
	
//method 9: shift
	public static Queue<Integer>  shift(Stack<Integer> S, int N) {
	    Queue<Integer> Q = new LinkedList<Integer>();
	    int size = S.size();
	    
	    while(!S.isEmpty())
	        Q.add(S.pop());
	        
	    for(int i = 0; i < size - N; i++)
	        S.push(Q.remove());
	        
	    while(!S.isEmpty())
	        Q.add(S.pop());
	        
	    for(int i = 0; i < N; i++)
	        Q.add(Q.remove());
	        
	    while(!Q.isEmpty())
	        S.push(Q.remove());
	    return Q;
	}//end of shift method
	
}//end of class
