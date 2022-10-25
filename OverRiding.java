package com.example.demo.model;


import org.springframework.boot.autoconfigure.gson.GsonProperties;

class A
    {
        public void show()
        {
            System.out.println("print A");
        }
    }

    class B extends A {
        @Override
        public void show()
        {
            System.out.println("print B");
        }
    }


    public class OverRiding {
        public static void main(String[] args) {
            B obj = new B();
            obj.show();
        }


    }


