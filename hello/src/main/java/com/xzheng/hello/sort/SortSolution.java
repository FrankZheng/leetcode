package com.xzheng.hello.sort;

/**
 * @author Frank Zheng
 * @date 15/5/8.
 */
public class SortSolution {

    public void bubbleSort(Integer[] numbers) {
        for( int i = 0 ; i < numbers.length ; i++) {
            for(int j = 0 ; j < numbers.length - i-1; j++) {
                if( numbers[j] > numbers[j+1]) {
                    //swap it
                    Integer temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
