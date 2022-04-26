import java.io.*;
import java.util.Arrays;
import java.util.Collections;
 
class Problem_01 {
    static boolean areAnagram(char[] str1, char[] str2)//Function that we will use to determine if the string is an anaagram
    {
        int n1 = str1.length;//sets n1 value to integer value of str1 length
        int n2 = str2.length;//sets n2 value to integer value of str2 length
        if (n1 != n2)//If they re not equal to each other then the program returns false
            return false;
        Arrays.sort(str1);//Sorts the array
        Arrays.sort(str2);//Sorts the array
        for (int i = 0; i < n1; i++)//For loop that checks each value of the array
            if (str1[i] != str2[i])// if they are not equal then it is not an anagram
                return false;
 
        return true;
    }
    public static void main(String args[])
    {
        char str1[] = { 'c', 'a', 'r', 'd' };//String 1
        char str2[] = { 'a', 'c', 'd', 'r' };//String 2
        
        if (areAnagram(str1, str2))//It the program returns 
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
}