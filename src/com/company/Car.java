package com.company;

public class Car {
    private int id;
    private String nomerAvto;

    public Car(int id, String nomerAvto) {
        this.id = id;
        this.nomerAvto = nomerAvto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomerAvto() {
        return nomerAvto;
    }

    public void setNomerAvto(String nomerAvto) {
        this.nomerAvto = nomerAvto;
    }

    @Override
    public String toString() {
        return  "ID:"+id  +" "+" '"+nomerAvto+"' " ;

    }
}
