package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        CarInfo carInfo1 = new CarInfo(2022,"Toyota Camry",25000,"white");
        CarInfo carInfo2 = new CarInfo(2022,"Mercedes Benz",30000,"black");
        CarInfo carInfo3 = new CarInfo(2022,"Tesla",60000,"silver");

        Car car1 = new Car(1,"01KG001AAA");
        Car car2 = new Car(2,"01KG002AAA");
        Car car3 = new Car(3,"01KG009AAA");
        Car car4 = new Car(4,"01KG003AAA");
        Car car5 = new Car(5,"01KG004AAA");
        Car car6 = new Car(6,"01KG005AAA");
        Car car7 = new Car(7,"01KG006AAA");
        Car car8 = new Car(8,"01KG007AAA");
        Car car9 = new Car(9,"01KG008AAA");
        Car car10 = new Car(10,"01KG010AAA");
        Car car11 = new Car(11,"01KG011AAA");
        Car car12 = new Car(12,"01KG012AAA");


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

        for(HashMap.Entry<Car,CarInfo> car:carsHashMap.entrySet()){
            System.out.println("Car:"+car.getKey().toString()+" "+car.getValue().toString());
        }
    }
}
