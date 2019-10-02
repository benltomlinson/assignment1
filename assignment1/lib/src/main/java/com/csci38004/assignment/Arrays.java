package com.csci38004.assignment;

public class Arrays {
    private
    int[] squares = new int[10];

    public Arrays() {
        int index = 0;
        int numSquared;
        int num = 1;
        while(index < 10){
            numSquared = num * num;
            if((numSquared % 2) == 0){
                squares[index] = numSquared;
                num++;
                index++;
            }else {
                num++;
            }
        }
    }

    private void printSquaresBackward() {
        int printIndex;
        for (printIndex = 9; printIndex >= 0; printIndex--){
            System.out.println(this.squares[printIndex]);
        }

    }

    public static void main(String[] args){
        Arrays arrays = new Arrays();
        arrays.printSquaresBackward();
    }
}
