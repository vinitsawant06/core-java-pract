package com.tobedelete;

import javafx.scene.Node;

public class BinaryTree {
    public static void main(String[] args) {
        int myNumber = 433782;
        int tempNumber = 0;
        while (myNumber>0) {
            int lastDigit = myNumber%10;
            System.out.println(lastDigit);
            tempNumber = tempNumber*10 + lastDigit;
            System.out.println(tempNumber);
            myNumber = myNumber/10;
            System.out.println(myNumber);
        }
        System.out.println(tempNumber);
    }
}
