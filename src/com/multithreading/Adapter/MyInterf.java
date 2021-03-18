package com.multithreading.Adapter;

interface MyInterface {
    void m1();
    void m2();
    void m3();
    void m4();
    void m5();

    }

    class AdapterClass implements MyInterface {


        @Override
        public void m1() {

        }

        @Override
        public void m2() {

        }

        @Override
        public void m3() {

        }

        @Override
        public void m4() {

        }

        @Override
        public void m5() {

        }
    }

    public class MyInterf extends AdapterClass {

     public void m2() {

     }
    }
