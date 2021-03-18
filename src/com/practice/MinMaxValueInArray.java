package com.practice;

public class MinMaxValueInArray {
    public static void main(String[] args) {
        int myArray[] = {20,30,22,12,99,87,111,3,1};
        int maxnumber= myArray[0];
        int minnumber= myArray[0];

        for(int index=0; index<=myArray.length-1; index++) {
            if(myArray[index]>maxnumber) {
                maxnumber = myArray[index];
            } else if(myArray[index]<minnumber) {
                minnumber = myArray[index];
            }
        }
//        for(int index=0; index<myArray.length; index++) {
//            if(myArray[index]<minnumber) {
//                minnumber = myArray[index];
//            }
//        }
        System.out.println("Maximum number: "+maxnumber);
        System.out.println("Minimum number: "+minnumber);

    }
}
