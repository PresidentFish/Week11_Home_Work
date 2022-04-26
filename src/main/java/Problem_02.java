import java.io.*;
 //this program takes two arrays and combines them into one array with values of both arrays
class Problem_02
{
    static int NA =-1;
    static void Merge(int a[], int b[], int n, int m)//function that takes in 4 varibles, 2 arrays and 2 integers
    {
        int i = n - 1;
        int j = m - 1;
         
        int lastIndex = n + m - 1;
        while (j >= 0)//uses an inner loop to run the values of the first array, once the first half is filled it then filles the second half with J
        {
            if (i >= 0 && a[i] > b[j])
            {
                a[lastIndex] = a[i];
                i--;
            } else
            { 
                a[lastIndex] = b[j];
                j--;
            }
            lastIndex--;
        }
    }
    static void printArray(int arr[], int n)//prints the new array
    {
        System.out.println ( "This is the fal value of the array:---------" ) ;
        for (int i = 0; i < n; i++)//for loop that runs the length of the array
            System.out.print(arr[i] +" ");//use the i value to go through each varible in the array
    }
    public static void main (String[] args)
    {
        int a[] = {1, 2, 3, 4, 5, NA, NA, NA, NA, NA};// array we are using to combine with another array
        int n = 5;//the size of the array
        int b[] = {6,7,8,9,10};//second array
        int m = 5;
        Merge(a, b, n, m);
        printArray(a, 10);
    }
}