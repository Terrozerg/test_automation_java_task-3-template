package com.epam.test.automation.java.practice3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void task1PassTest(){
        Assert.assertEquals(new int[]{4,5,3,10},
                Main.task1(new int[]{10, 5, 3, 4}));
        Assert.assertEquals(new int[]{4,5,-3,-10},
                Main.task1(new int[]{-10, 5, -3, 4}));
    }

    @Test
    public void task1BorderTest(){
        int maxEvenNumber = Integer.MAX_VALUE-1;
        Assert.assertEquals(new int[]{-88,46,3,Integer.MIN_VALUE,maxEvenNumber},
                Main.task1(new int[]{maxEvenNumber, Integer.MIN_VALUE, 3, 46, -88}));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void task1NullTest(){
        Main.task1(null);
    }

    @Test
    public void task2PositiveIntegersArrayTest(){
        Assert.assertEquals(2,Main.task2(new int[]{4, 100, 55, 100, 4}));
    }

    @Test
    public void task2NegativeIntegersArrayTest(){
        Assert.assertEquals(3,Main.task2(new int[]{-4, -100, 55, -100, 4, 55, 0}));
    }

    @Test
    public void task2AllNegativeIntegersArrayTest(){
        Assert.assertEquals(4,Main.task2(new int[]{-4, -100, -55, -100, -4, -55}));
    }

    @Test
    public void task2OnlyOneMaxTest(){
        Assert.assertEquals(0,Main.task2(new int[]{0, 100, 55, 6, 4}));
    }

    @Test
    public void task2AllItemsEqualMaxTest(){
        Assert.assertEquals(5,Main.task2(new int[]{4, 4, 4, 4, 4, 4}));
    }

    @Test
    public void task2BorderTest(){
        Assert.assertEquals(3,
                Main.task2(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 4, 40, Integer.MAX_VALUE, -66}));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void task2NullTest(){
        Main.task2(null);
    }

    @Test
    public void task3PassTest(){
        int[][] input = new int[][]{{2,4,-3,3},{2,-1,1,1},{5,7,-8,5},{3,7,9,1}};
        int[][] output = new int[][]{{2,1,1,1},{0,-1,1,1},{0,0,-8,1},{0,0,0,1}};
        Assert.assertEquals(output, Main.task3(input));
    }

    @Test
    public void task3BorderTest(){
        int[][] input = new int[][]{{2,Integer.MAX_VALUE,-3,3},{2,-1,1,1},{5,7,Integer.MIN_VALUE,5},{3,7,9,1}};
        int[][] output = new int[][]{{2,1,1,1},{0,-1,1,1},{0,0,Integer.MIN_VALUE,1},{0,0,0,1}};
        Assert.assertEquals(output, Main.task3(input));
    }

    @Test(
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Cant pass null matrix.")
    public void task3MatrixNullTest(){
        Main.task3(null);
    }

    @Test(
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Cant pass non-square matrix.")
    public void task3MatrixNonSquareTest(){
        Main.task3(new int[][]{{2,-4,3,3},{2,-1,1,1},{5,7,8,5}});
    }
}