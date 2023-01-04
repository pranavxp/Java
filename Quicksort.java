package pranavlab;

import java.util.Scanner;

public class Quicksort {

    String names[];
    int length;

    public static void main(String[] args) {
        Quicksort obj = new Quicksort();
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of names you want to enter:");
       int n = sc.nextInt();
        String names[] = new String[n];
        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
            names[i] = s1.nextLine();
        obj.sort(names);

        for (String i : names) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int low, int high) {
        int i = low;
        int j = high;
        String pivot = this.names[low + (high - low) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(low, j);
        }
        if (i < high) {
            quickSort(i, high);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}