package Asg_3;

import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] originalArray = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n--- SORTING MENU ---");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting program.");
                break;
            }

            int[] arr = originalArray.clone();

            switch (choice) {
                case 1:
                    bubbleSort(arr);
                    System.out.print("Sorted array (Bubble Sort): ");
                    printArray(arr);
                    break;
                case 2:
                    selectionSort(arr);
                    System.out.print("Sorted array (Selection Sort): ");
                    printArray(arr);
                    break;
                case 3:
                    insertionSort(arr);
                    System.out.print("Sorted array (Insertion Sort): ");
                    printArray(arr);
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 4.");
            }
        }
        sc.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
