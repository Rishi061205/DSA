package linearsearch;

import java.util.Scanner;


public class Soln {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner ele = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int x = ele.nextInt(); 
        int result = LinearS(arr, x); 
        if (result == -1) {
            System.out.println("The number is not in the array.");
        } else {
            System.out.println("The number found at index: " + result);
        }

        ele.close(); // Close the scanner
    }

    static int LinearS(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; 
            }
        }
        return -1; 
    }
}
