import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 5, 6, 7, 8};
        String[] arr2 = new String[]{"One", "Two", "Three", "Four", "Five"};
        int[][] arr3 = new int[][]{{1, 2, 3, 4, 5}, {8, 7, 6, 5, 4}};
        float[][] arr4 = new float[][]{{1.5F, 2.3F}, {8.6F, 1.4F}};
        PrintArr(arr1);
        PrintArr(arr2);
        PrintArr(arr3);
        PrintArr(arr4);

    }

    public static void PrintArr(int[] arr)
    {
        int [] array  = new int [arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            array [i] = arr [i];
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));
    }

    public static void PrintArr(String[] arr)
    {
        String [] array  = new String [arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            array [i] = arr [i];
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));
    }
    public static void PrintArr(int[][] arr)
    {
        int [][] array  = new int [arr.length][arr[0].length];
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                array [i][j] = arr [i][j];
            }
            System.out.println (Arrays.toString(array[i]));
        }
        
    }

    public static void PrintArr(float[][] arr)
    {
        float [][] array  = new float [arr.length][arr[0].length];
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                array [i][j] = arr [i][j];
            }
            System.out.println (Arrays.toString(array[i]));
        }

    }


}