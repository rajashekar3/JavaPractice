package com.example.demo.model;

public class OverLoading {

        public int add ( int x, int y){
            return x + y;
        }
        public int add ( int x, int y, int z)
        {
            return x + y + z;
        }


    public static void main(String[] args) {
            OverLoading obj = new OverLoading();
        System.out.println(obj.add(4, 3,6));
    }
}

