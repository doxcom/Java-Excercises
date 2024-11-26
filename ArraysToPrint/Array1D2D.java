package ArraysToPrint;

import java.util.Arrays;

public class Array1D2D {


    public static void main(String[] args) {

        int markv [] = {23,45,67,87,900};

        System.out.println(markv); // will print location in memory

        System.out.println(Arrays.toString(markv)); //will print [23,45,67 ...]

        //for 2D Array

        int [][] matrix = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(matrix)); //for 2D

        //one parte of the matrix array:
       //matrix[0] is a 1D array
        System.out.println(Arrays.toString(matrix[0]));


    }
}
