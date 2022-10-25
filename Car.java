package com.example.demo.model;


class Car{

    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}
class Maruti extends Car{

    public void brand()
    {
        System.out.println("Brand: Maruti");
    }
    public void speed()
    {
        System.out.println("Max: 90Kmph");
    }
}
class Maruti800 extends Maruti{

    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
        Maruti800 obj=new Maruti800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}