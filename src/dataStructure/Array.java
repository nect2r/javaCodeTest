package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Integer[][][] data_list = {
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };

        System.out.println("data_list[1][0][2] = " + data_list[1][0][1]);
        System.out.println("data_list[1][1][0] = " + data_list[1][1][0]);
        System.out.println("data_list[0][0][1] = " + data_list[0][0][1]);
    }
}
