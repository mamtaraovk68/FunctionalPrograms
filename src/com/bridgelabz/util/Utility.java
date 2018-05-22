package com.bridgelabz.util;

import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Utility {

	static ArrayList <Integer> arrayList=new  ArrayList <Integer>();
	static Scanner scanner = new Scanner(System.in);
	static Random ran = new Random();

	/*
	 * Method to take user input as string
	 */
	public static String userInputString() {
		String str = scanner.next();
		return str;
	}

	/*
	 * Method to take user input as integer
	 */
	public static int userInputInteger() {
		return scanner.nextInt();
	}
	
	/*
	 * Method to take user input as double
	 */
	public static Double userInputDouble() {
		return scanner.nextDouble();
	}

	/*
	 * Method to take user input as boolean
	 */
	public static boolean userInputBoolean() {
		return scanner.nextBoolean();
	}
	
	
	private static char[] arrayList(Object object) {
		return null;
	}

	private static Object get(int i) {
		return null;
	}
	
	/**
	 * Method to replace the a string with the user input name
	 * @param temp
	 * @return
	 */
	public static String replaceUserName(String temp) {
		System.out.println("Enter your name: ");
		String res = temp.replace("<<username>>", userInputString());
		return res;
	}

	
	
	/**
	 * Method to calculate percentage of head vs tail in the given number of trials
	 * @param timesofflip
	 */
	public static void genPercentage(int timesofflip) {
		float head = 0;
		float tail = 0;
		float headPercent;
		float tailPercent;
		for (int i = 1; i <= timesofflip; i++) {
			if (Math.random() < 0.5)
				head++;
			else
				tail++;
		}

		headPercent = (head * 100) / timesofflip;
		tailPercent = (tail * 100) / timesofflip;
		System.out.println("number of times head appeared: " + head);
		System.out.println("number of times tail appeared: " + tail);
		System.out.println("head percentage: " + headPercent + "%");
		System.out.println("tail percentage: " + tailPercent + "%");
	}

	
	/**
	 * Method to check given year is leap year or not
	 * @param year
	 * @return
	 */
	public static String checkLeapYear(String year) {
		 boolean isleap=false;
		 
		 if(year.length()==4)
		 {
			 int yr=Integer.parseInt(year);
			 if (yr % 4 == 0) {
					if (yr % 100 == 0) {
						if (yr % 400 == 0) {
							isleap=true;
						} else {
							isleap= false;
						}
					} else {
						isleap=true;
					}
				} else {
					isleap=false;
				}
			 
		 }
		 if(isleap) {
			 return  "It is a leap year";
		 }
		 else {
			 return "It is not a leap year";
		 }
		}
	
	
	
	

	/**
	 * Method to print all powers of two
	 * @param power
	 */
	public static void printPower(int power) {
		if (power < 31) {
			System.out.println("The table of power of 2 till " + power + ": ");
			for (int i = 1; i <= power; i++) {
				int res = twoPower(i);
				System.out.println("2^" + i + "= " + res);
			}
		} 
		else {
			System.out.println("Enter value less than 32!!");
		}
	}

	/*
	 * method to find power of two for each number
	 */
	public static int twoPower(int i) {
		int temp = 1;
		for (int x = 1; x <= i; x++) {
			temp = temp * 2;
		}
		return temp;
	}

	
	
	/*
	 * Method to find Harmonic number 
	 * @param number
	 * @return
	 */
	public static double findHarmonic(int number) {
		double output = 0;

		for (double i = 1; i<=number; i++) {
			double x = 1 / i;
			output = output + x;
		}
		return output;
	}
	
	
	
	/**
	 * Method to find prime factors using brute's force
	 * @param num
	 */
	static int count = 0;
	public static void findPrime(int num) {
		int[] prime = new int[num];

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime[count] = i;
				count++;
				}
		}
		System.out.print("the prime factors of " + num + " are : ");
		for (int x = 0; x < count; x++) {
			System.out.print(prime[x] + " ");
		}
	}

	
	
	
	/*
	 * Method to take 2D array elements in integer,double or string type from user
	 * and store it in memory
	 * @return
	 */
	public static double[][] arrayElement() {
		System.out.println("enter number of rows");
		int m = userInputInteger();
		System.out.println("enter number of columns");
		int n = userInputInteger();
		double[][] ar = new double[m][n];
		System.out.println("enter " + (m * n) + " elements of the 2D array: ");
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print("enter ar[" + i + "][" + j + "] = ");
				ar[i][j] = userInputDouble();
				}
		}
		return ar;
	}

	
	
	
	/**
	 * Method to print the number of triplet whose sum is zero and also outputs the
	 * total number of count
	 */

	public static void sumTriplet(int num) {
		int[] ar = new int[num];
		System.out.println("Enter " + num + " integers: ");
		for (int i = 0; i < num; i++) {
			ar[i] = userInputInteger();
		}
		int count = 0;
		for (int i = 0; i <= ar.length - 3; i++) {
			for (int j = i + 1; j <= ar.length - 2; j++) {
				for (int k = j + 1; k <= ar.length - 1; k++) {
					if (ar[i] + ar[j] + ar[k] == 0) {
						count++;
						System.out.println("{ " + ar[i] + ", " + ar[j] + ", " + ar[k] + " }");
					}
				}
			}
		}
		if (count!= 0)
			System.out.println("there are a total of " + count + " number of triplet whose sum counts to zero");
		else
			System.out.println("There are no triplets found in the given array!!");

	}

	
	/**
	 * Method to calculate Euclid distance of given point from the origin
	 * @param x
	 * @param y
	 * @return
	 */
	public static double calcEuclid(double x, double y) {
		double sum = (Math.pow(x, x)) + (Math.pow(y, y));
		return Math.sqrt(sum);
	}

	
	
	/**
	 * To check whether the coupon numbers entered by user are distinct or not
	 * @param num
	 * @return integer array
	 */
	public static int[] checkDistinct(int num) {
		int[] ar = new int[num];
		System.out.println("Enter " + num + " distinct coupons: ");

		for (int i = 0; i < num; i++) {
			ar[i] = Utility.userInputInteger();
			if (i != 0) {
				for (int j = i - 1; j >= 0; j--) {
					if (ar[i] == ar[j]) {
						System.out.println("You have entered duplicate values.Please start again!!");
						checkDistinct(num);
					}
				}
			}
		}
		return ar;
	}

	/**
	 * Method to return the all possible random numbers need to be generated to get
	 * all n distinct coupons
	 * 
	 * @param num
	 * 
	 * @return
	 */
	public static int randomGen(int num) {
		int[] ar = checkDistinct(num);
		int match = 0;
		int codeCount = 0;

		while (match != ar.length) {
			int code = ran.nextInt(100);
			codeCount++;
			for (int i = 0; i < ar.length; i++) {
				if (code == ar[i]) {
					match++;
				}
			}
		}
		return codeCount;
	}

	/**
	 * Method to return all possible permutation of given string
	 * @param ch
	 * @param key
	 */
	public static void permutation(char[] ch, int key) {

		if (key == ch.length) {
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}

		else {
			for (int i = 0; i < ch.length; i++) {
				char temp = ch[key];
				ch[key] = ch[i];
				ch[i] = temp;

				permutation(ch, key + 1);

				temp = ch[key];
				ch[key] = ch[i];
				ch[i] = temp;
			}
		}
	}

	
	
	
	/**
	 * Method to calculate the elapsed time in milliseconds
	 */
	public static void elapsedTime() {
		System.out.println("To start stopwatch, type 1");
		userInputInteger();
		long startTime = System.currentTimeMillis();
		System.out.println("To stop stopwatch, type 0");
		userInputInteger();
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println(estimatedTime + "ms");
	}

	
	/**
	 * Method to play tic-tac-toe
	 * @param row1
	 * @param col1
	 */
	public static void letsPlay(int row1, int col1) {
		int[][] ar = formTable(row1, col1);
		System.out.println("Enter the row and col number in which you want to insert X");
		int a = 0;
		
		while (a!= 2) {
			System.out.println("Enter the row:");
			int row = userInputInteger();
			System.out.println("Enter the col:");
			int col = userInputInteger();
			ar[row][col] = 88;
			show(ar);
			a = winnerUser(ar);
			computer(ar, row, col);
		}
		System.out.println("Youwon");
	}

	/*
	 * Method to trigger computer's turn(randomly generated)
	 * @param row
	 * @param col
	 */
	public static void computer(int[][] ar, int row, int col) {
		int comrow = ran.nextInt(3);
		int comcol = ran.nextInt(3);
		if (comrow == row && comcol == col) {
			computer(ar, row, col);
		}
		System.out.println("System turn ..!!");
		ar[comrow][comcol] = 48;
		show(ar);
	}

	/*
	 * Method to decide who is the winner
	 * @param ar
	 * @return
	 */
	public static int winnerUser(int[][] ar) {
		int i = 0;

		for (i = 0; i < 3; i++) {
			int j = 0;
			int count = 0;
			while (j < 3) {
				if (ar[i][j] == 2) {
					j++;
					count++;
				} else
					j++;
			}
			if (count == 3) {
				return 2;
			}

			for (int x = 0; x < 3; x++) {
				int y = 0;
				int count1 = 0;
				while (y < 3) {
					if (ar[y][x] == 2) {
						y++;
						count1++;
					} else
						y++;
				}
				if (count1 == 3) {
					return 2;
				}
				if (ar[0][0] == 2 && ar[1][1] == 2 && ar[2][2] == 2
						|| ar[0][2] == 2 && ar[1][1] == 2 && ar[2][0] == 2) {
					return 2;
				}
			}
		}
		return 0;
	}

	
	/*
	 * Method to display reference play board
	 * @param row
	 * @param col
	 * @return
	 */
	public static int[][] formTable(int row1, int col1) {
		int[][] ar = new int[row1][col1];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j]=42;
				System.out.print("[" + i + "][" + j + "]  ");
			}
			System.out.println();
			System.out.println();
		}
		return ar;
	}

	/*
	 * Method to display modified play board after each of the player's turn
	 * @param ar
	 */
	public static void show(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print((char)ar[i][j]);
			}
			System.out.println();
		}
	}

	
	
	/**
	 * Method to find roots of the quadratic equation
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static double[] findRoots(double a, double b, double c) {
		double delta = Math.abs((b * b) - (4 * a * c));
		double root1 = ((-b) + Math.sqrt(delta)) / (2 * a);
		double root2 = ((-b) - Math.sqrt(delta)) / (2 * a);
		double[] ar = {root1,root2};
		return ar;
	}

	
	
	/**
	 * Method to calculate wind chill based on given temperature 'temp' and wind
	 * speed 'wind'
	 * @param temp
	 * @param wind
	 * @return
	 */
	public static double calcWindChill(double temp, double wind) {
		return 35.74 + (0.6215 * temp) + (((0.4275 * temp) - 35.75) * Math.pow(wind, 0.16));
	}

	
	
	/*
	 * Method to calculate percentage of win and loss
	 * @param $stake
	 * @param $goal
	 * @param plays
	 */
	public static void gambling(double stake, double goal, int plays) {
		double win = 0;

		for (int i = 1; i <= plays; i++) {
			while (stake != goal) {
				if (Math.random() < 0.5) {
					stake -= 1;
				} else {
					stake += 1;
					win++;
				}
				break;
			}
		}
		double winP = (win * 100)/ plays;
		double lossP = (100) - (winP);
		System.out.println("NO of times he/she wins: " + win + " out of " + plays + " no. of plays ");
		if (stake == goal) {
			System.out.println("reached goal/win");
			System.out.println("win percentage: " + winP+"%");
			System.out.println("loss percentage: " + lossP+"%");

		} else {
			System.out.println("coudn't reach goal/loss");
			System.out.println("win percentage: " + winP+"%");
			System.out.println("loss percentage: " + lossP+"%");
		}

	}
	
	//*********************************************************************
	
	/**
	 * Method to print all the prime numbers between 0 to 1000
	 * @param num
	 */
	public static int TOTAL=0;
	public static void printPrime(int num){
		int count=0;
		
		for(int i=2 ; i<=num ;i++ ){
			if(num%i==0){
				count++;
				}
		}
		if(count==1) {
			System.out.println(num);
		    arrayList.add(num);
			TOTAL++;
		}
		else {
			return;
		}
}
	
	
	
	
	
	/**
	 * Method to check pairs of prime numbers which are anagram
	 * @param num1
	 * @param num2
	 */
	public static void checkAnag(){
		
		for (int i = 0; i<arrayList.size(); i++) {
			for(int j=i+1 ; j<=arrayList.size() ; j++) {
		
		
		String s1= String.valueOf(arrayList(get(i)));
		String s2= String.valueOf(arrayList(get(j)));
		int count=0;
		
		for(int x=s1.charAt(0) ; x<s1.length(); x++){
			for(int y=s2.charAt(0) ; y<s2.length(); y++) {
				if(x==y) {
					count++;
				}
			}
			if(count==s1.length()) {
				System.out.println(s1 +" & "+ s2);
			}
		}
		}}
		
	}
	

	

	/**
	 * Method to check whether a given number is pallindrome
	 * @param num
	 */
	public static void checkPallindrome(){
		for (int i = 0; i<arrayList.size(); i++) {
		String s1= String.valueOf(arrayList.get(i));
		int lastIndex=s1.length()-1;
		String res="";
		for(int j=lastIndex ; j>=0 ; j--) {
	    	res=res+s1.charAt(i);
	    	}
	    if (res==s1) {
	    	System.out.println(s1 +" is a pallindrome ");
	    }
		}
	}
	
	
	
	/**
	 * Method to perform binary search to find the integer element 
	 * @param ar
	 * @param element
	 * @return
	 */
	public static int binSearchInt(int[] ar , int element){
		int start=0;
		int end =ar.length-1;
		 
		while (start <= end){
		     int mid = start + (end-start)/2;
		            if (ar[mid]==element)
		                return mid;
		            if (ar[mid]<(element))
		                start = mid + 1;
		            else
		                end = mid - 1;
		     }
		        return -1;
	}
	
	
	/**
	 * Method to perform binary search to find the string element 
	 * @param ar
	 * @param element
	 * @return
	 */
	
	public static int binSearchStr(String[] ar, String element){
		
		int start=0;
		int end =ar.length-1;
		 
		while (start <= end){
		      int mid = start + (end-start)/2;
	
		            if (ar[mid].equals(element))
		                return mid;
		            if (ar[mid].compareTo(element)<0)
		                start = mid + 1;
		            else
		                end = mid - 1;
		     }
		        return -1;
		}
	
	
	public static <T extends Comparable<T>> void binSearchGenerics(T[] ar , T element){
		int start=0;
		int end =ar.length-1;
		 
		while (start <= end){
		     int mid = start + (end-start)/2;
		            if (ar[mid]==element)
		            	System.out.println("Element found at " + "index " + mid);
		            if (ar[mid].compareTo(element)<0)
		                start = mid + 1;
		            else
		                end = mid - 1;
		     }
	}

	
	/**
	 * Method to perform insertion sort on integer
	 * @param size
	 * @return
	 */
	public static int[] insertSortInt(int size) {
	int[] ar=new int[size];
	System.out.println("Enter the elements in the array");
	
	for(int i=0 ; i<size ; i++){
		ar[i]=userInputInteger();
	}
	for(int i=1 ; i<size ;i++) {
		int key=ar[i];
		int j=i-1;
		while(j>=0 && key<ar[j]) {
			ar[j+1]=ar[j];
			j=j-1;
		}
		ar[j+1]=key;
	}
return ar;
	}

	/*
	 * Method to perform insertion sort in string
	 */
	public static String[] insertSortStr(int size) {
		String[] str=new String[size];
		System.out.println("Enter the elements in the array");
		
		for(int i=0 ; i<size ; i++){
			str[i]=userInputString();
		}
		
		for(int i=1 ; i<size ;i++) {
			String key=str[i];
			int j=i-1;
			while(j>=0 && (key.compareTo(str[j])<0)) {
				str[j+1]=str[j];
				j=j-1;
			}
			str[j+1]=key;
		}
	return str;
		}

	
	/**
	 * Generic insertion sort that takes both string and integer as input
	 * @param size
	 * @return
	 */
	public static <T extends Comparable<T>> T[] insertSortGen(T[] ar) {
	for(int i=1 ; i<ar.length ;i++) {
		T key=ar[i];
		int j=i-1;
		while(j>=0 && key.compareTo(ar[j])<0) {
			ar[j+1]=ar[j];
			j=j-1;
		}
		ar[j+1]=key;
	}
return ar;
	}
	
	
	
	
	
	
	
	
	
/**
 * Method to perform bubble sort on integer 
 * @param size
 * @return
 */
public static int[] bubbleSortInt(int size) {
	int[] ar=new int[size];
	System.out.println("Enter the elements in the array");
	
	for(int i=0 ; i<size ; i++){
		ar[i]=userInputInteger();
	}
	
	for(int i=0;i<size-1;i++) {
		for(int j=i+1 ; j<size ;j++) {
			if(ar[i]>ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	return ar;
	}

/*
 * Method to perform bubble sort in string
 * 
 */
public static String[] bubbleSortStr(int size) {
	String[] ar=new String[size];
	System.out.println("Enter the elements in the array");
	
	for(int i=0; i<size ; i++) {
		ar[i]=userInputString();
	}
	
	for(int i=0;i<size-1;i++) {
		for(int j=i+1 ; j<size ;j++) {
			if(ar[i].compareTo(ar[j]) >0) {
				String temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	return ar;
	}


/**
 * Generic method for bubble sort: takes both string and integer as input
 * @param ar
 * @return
 */
public static <T extends Comparable<T>> T[] bubbleSortGen(T[] ar) {
	for(int i=0;i<ar.length-1;i++) {
		for(int j=i+1 ; j<ar.length ;j++) {
			if(ar[i].compareTo(ar[j])>0) {
				T temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	return ar;
	}



/**
 * Method to play guess game
 * @param num
 */
    public static int guessGame(int low,int high) {
		            if (high - low == 1) {
		                return low;
		            }
		            int mid = low + (high - low) / 2;
		            System.out.println("Is it less than " + mid);
		            if (userInputBoolean()) {
		                return guessGame(low,mid);
		            }
		            else {
		            return guessGame(mid,high);
		            }
		        }


 
    /**
     *  Method to find a word using binary search froma file
     * @throws IOException
     */
    public static void searchWord() throws IOException{
    	BufferedReader in = new BufferedReader(new FileReader("/home/administrator/Documents/test"));
        String str;
        while((str = in.readLine())!= null){
            String[] arr = str.split("");
            for(int i=0 ; i<str.length() ; i++){
                arr[i] = in.readLine();
            }
            System.out.println(arr[2]);

    
    System.out.println("Enter the word you want to search for:");
    String s1=scanner.next();
    int result=binSearchStr(arr, s1);
	if (result == -1)
		System.out.println("Element not present");
	else
		System.out.println("Element found at " + "index " + result);
    
    }in.close();
    }
    
    
	/**Method to perform merge sort
	 *
	 * @param ar
	 * @param l
	 * @param r
	 */
   
 public static String[] mergeArray(String[] left, String[] right) {
        String[] merged = new String[left.length+right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;
        int comp = 0;
        while (lIndex < left.length || rIndex < right.length) {
            if (lIndex == left.length) {
                merged[mIndex++] = right[rIndex++];
            } else if (rIndex == right.length) {
                merged[mIndex++] = left[lIndex++];
            } else {  
                comp = left[lIndex].compareTo(right[rIndex]);
                if (comp > 0) {
                    merged[mIndex++] = right[rIndex++];
                } else if (comp < 0) {
                    merged[mIndex++] = left[lIndex++];
                } else { 
                    merged[mIndex++] = left[lIndex++];
                }
            }   
        }
        return merged;
    }
    
  
        
       public static void merge(String arr[], int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            String L[] = new String [n1];
            String R[] = new String [n2];
     
            for (int i=0; i<n1; ++i)
                L[i] = arr[l + i];
            for (int j=0; j<n2; ++j)
                R[j] = arr[m + 1+ j];
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2){
                if (L[i].compareTo(R[j])<=0) {
                    arr[k] = L[i];
                    i++;
                }
                else{
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
     
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
     
            while (j < n2){
                arr[k] = R[j];
                j++;
                k++;
            }
        }
     
       
        public static void sort(String arr[], int l, int r) {
            if (l < r) {
                int m = (l+r)/2;
                sort(arr, l, m);
                sort(arr , m+1, r);
                merge(arr, l, m, r);
            }
        }
                
  public static void printArray(String arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
     
       

   /**
   Method to find the day of the week using gregorian calender
    * @param day
    * @param month
    * @param year
    * @return
    */
    public static String dayOfWeek(int day, int month, int year) {
    	int y1=year-(14 - month)/12;
    	int x = y1 + y1 /4 - y1 /100 + y1 /400;
    	int m1 = month + 12*((14 - month ) / 12) - 2;
    	int d1= ( day + x + (31*m1) / 12) % 7;
    	String res="";
    	
    	switch(d1) {
    	case 0:res=res+"Sunday";
    	break;
    	case 1:res=res+"Monday";
    	break;
    	case 2:res=res+"Tuesday";
    	break;
    	case 3:res=res+"Wednesday";
    	break;
    	case 4:res=res+"Thursday";
    	break;
    	case 5:res=res+"Friday";
    	break;
    	case 6:res=res+"Satday";
    	break;
	}
    	return res;
   }
    	
    	
    	
   /**
    * Method for temperature conversion : celsius to farenheit and vice versa
    * @param choice
    * @return
    */
    public static double temperatureConversion(int choice) {
	   if(choice==1) {
		   System.out.println("Enter temerature in celsius");
		   double faren=(userInputDouble() *( 9/5)) + 32 ;
		   return faren;
	   }
	   else if(choice==2) {
		   System.out.println("Enter temerature in farenheit");
		   double cel=(userInputDouble()-31)*(5/9);
		   return cel;
	   }
	   else {
		   return -1;
	   }
   } 
   
    	
    	
    /**
     * Method to calculate monthly payment
     * @param P
     * @param Y
     * @param R
     * @return
     */
    public static double monthlyPayment(double P, double Y, double R){
	  double n=12*Y;
	  double r=R/(12*100);
	  double pwr = Math.pow((1+r), (-n));
	  return (P*r) / (1-pwr);
	 }
    	
 
    	/**
    	 * Method to find square root using Newton's raphson's method
    	 * @param t
    	 * @param num
    	 * @return
    	 */
    	public static double sqrt(double t,double num) {
    		double epsilon=Math.pow(10, -15);
    		if( ( Math.abs( ((t*t)-num)/t ) > (epsilon*t))){
    			return t;
    			}
    		else {
    			double replace=(num + (t*t) )/(2*t);
        		sqrt(replace,num);
    		}
    		return -1;
    		}
    	
    	/**
    	 * Method to convert decimal to binary
    	 * @param num
    	 * @return
    	 */
    	public static StringBuilder toBinary(int num) {
    		String out="";
    	
    		while(num!=0) {
    			int rem =num%2;
    			out=rem+out;
    			num=num/2;
    		}
    		
    		int size=out.length();
    		int temp=size;
    			while(size%4!=0) {
    				size++;
    		}
    			int diff=size-temp;
    			for(int i=1;i<=diff;i++) {
    			out='0'+out;
    			}
    			
    			int count=0;
    			StringBuilder sb=new StringBuilder(out);
    			for(int i=0;i<out.length();i++) {
    				count++;
    				if(count==5) {
    					sb.insert(i," ");
    					count=0;
    				} 
    			}
    			return sb;
    		}
    	
    	
    	public static int binary(int num) {
  if(num<127) {
    		StringBuilder str=toBinary(num);
    		String newstr=str.toString();
    		System.out.println(newstr);
    		int size=newstr.length();
    		String[] array= new String[size];
    		array=newstr.split(" ");
    		
    			String temp=array[0];
    			array[0]=array[1];
    			array[1]=temp;
    			String strBack="";
    			for(int i=0 ; i< array.length ; i++) {
    			strBack+=array[i];
    		}
    			strBack.replaceAll("\\s","");
    			System.out.println("After swapping: ");
    			System.out.println(strBack);
    			int dec=binToDecimal(strBack);
    		
    		return dec;
  }
  else return -1;
    	}
    
    	public static int binToDecimal(String string) {
    		int num=Integer.parseInt(string);
    		int count=0;
    		int out=0;
    		while(num!=0) {
    			int rem=num%10;
    			out=out+rem*pow(2,count++);
    			num=num/10;
    			
    		}
    		return out;
    	}
    	
    	public static int pow(int num,int power) {
    		int out=1;
    		for(int i=0;i<power;i++) {
    			out=out*num;
    		}
    		return out;
    	}
    	
    	
    	
    	
    
    
    
    
    
    
    
    
    
    
    
    
    
    	}


    
   


	
	
	

		








	

	


