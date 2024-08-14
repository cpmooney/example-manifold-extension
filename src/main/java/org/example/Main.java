package org.example;

public class Main {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.color = "red";
        thing.shape = "circle";
        System.out.println(thing.asJson());
    }
}