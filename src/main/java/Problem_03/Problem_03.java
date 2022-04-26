package Problem_03;
import java.lang.Math;


import java.util.Scanner;

// this program will find all the numbers that are not divisable by 7 in the pascal triangle. 

public class Problem_03 {

    public static void main(String[] args) throws Exception {
        
       System.out.println("Please input a row that you would like to check");
       Scanner in = new Scanner(System.in);//creates scanner object named in 
       int row = in.nextInt();
       int row_Counter = 0;
       double row_total = 0;
       
       
       for (int i =0; i < row; i++)
       {
           for (int j = 0; j < row_Counter; j++) {//we use this to create the level of the triangle value what we will check
               row_total = Math.pow(2, row-1);
           }

          
          
          
           if (row_total % 7 == 0)//checks the row to see if it is divisable by 7
           {
              return; 
           }
           else
           row_Counter = row_Counter+1;//if it is not divisiable by 7 do this
           
       }
       
       
        System.out.println("The total amount of rows not divisable by 7 is :" + row_Counter);
       
       
       
       
    }

   
    
    
}