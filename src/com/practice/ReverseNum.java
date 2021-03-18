package com.practice;

public class ReverseNum {

    public int reverse (int num) {
        int revNum = 0;
        while(num>0) {
            int rem = num%10;
            revNum = revNum*10 + rem;
            num = num/10;
        }
        return revNum;
    }
    public void pallindromNum (int firstNum) {
        int userGivenNum = firstNum;
        int firstRevNum = 0;
        while (firstNum > 0) {
            int rem = firstNum%10;
            firstRevNum = firstRevNum*10 + rem;
            firstNum = firstNum/10;
        }
        System.out.println(firstRevNum);
        if (userGivenNum == firstRevNum) {
            System.out.println("It's a Pallindrom Number!!");
        } else {
            System.out.println("It's not a Pallindrom Number!!");
        }
    }
}
