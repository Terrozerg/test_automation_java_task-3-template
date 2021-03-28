package com.epam.test.automation.java.practice3;

public class Main {

    private Main(){}

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        if(array==null){
            throw new IllegalArgumentException("Cant pass null array.");
        }
        int arrayLength = array.length;

        for (int i = 0, j=arrayLength-1; i < j; i++, j--) {
            if((array[i]&1)==0 && (array[j]&1)==0){
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        }

        return array;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        if(array==null){
            throw new IllegalArgumentException("Cant pass null array.");
        }

        int maxPos = 0;
        int firstMaximumPos = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i]>=array[maxPos]){
                //get position of first maximum
                if(firstMaximumPos==0 && array[i]!=array[maxPos]){
                    firstMaximumPos=i;
                }

                maxPos = i;
            }
        }

        return maxPos-firstMaximumPos;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        if(matrix==null){
            throw new IllegalArgumentException("Cant pass null matrix.");
        }

        if(matrix.length != matrix[0].length){
            throw new IllegalArgumentException("Cant pass non-square matrix.");
        }

        int diagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < diagonal; j++) {
                matrix[i][j] = 0;
            }

            for (int j = diagonal+1; j < matrix.length; j++) {
                matrix[i][j] = 1;
            }

            diagonal++;
        }

        return matrix;
    }
}
