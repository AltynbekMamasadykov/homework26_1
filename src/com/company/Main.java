package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        CarInfo carInfo1 = new CarInfo(2022,"Toyota Camry",25000,"white");
        CarInfo carInfo2 = new CarInfo(2022,"Mercedes Benz",30000,"black");
        CarInfo carInfo3 = new CarInfo(2022,"Tesla",60000,"silver");

        Car car1 = new Car(1,"01 KG 001 AAA");
        Car car2 = new Car(2,"01 KG 002 AAA");
        Car car3 = new Car(3,"01 KG 009 AAA");
        Car car4 = new Car(4,"01 KG 003 AAA");
        Car car5 = new Car(5,"01 KG 004 AAA");
        Car car6 = new Car(6,"01 KG 005 AAA");
        Car car7 = new Car(7,"01 KG 006 AAA");
        Car car8 = new Car(8,"01 KG 007 AAA");
        Car car9 = new Car(9,"01 KG 008 AAA");
        Car car10 = new Car(10,"01 KG 010 AAA");
        Car car11 = new Car(11,"01 KG 011 AAA");
        Car car12 = new Car(12,"01 KG 012 AAA");


        HashMap<Car,CarInfo> carsHashMap = new HashMap<>();
        carsHashMap.put(car11,carInfo2);
        carsHashMap.put(car1,carInfo2);
        carsHashMap.put(car10,carInfo3);
        carsHashMap.put(car2,carInfo2);
        carsHashMap.put(car4,carInfo1);
        carsHashMap.put(car3,carInfo1);
        carsHashMap.put(car5,carInfo3);
        carsHashMap.put(car6,carInfo3);
        carsHashMap.put(car7,carInfo1);
        carsHashMap.put(car9,carInfo2);
        carsHashMap.put(car8,carInfo1);
        carsHashMap.put(car12,carInfo3);

        for(HashMap.Entry car:carsHashMap.entrySet()){
            System.out.println("Car:"+car.getKey().toString()+" "+car.getValue().toString());
        }
    }
}
