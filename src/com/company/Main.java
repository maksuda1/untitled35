package com.company;

public class Main {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.setName("Gabriel");
        parrot.setWeight(1);
        parrot.setAge(2);
        parrot.setColour("black");
        System.out.println(parrot.getName());
        System.out.println(parrot.getWeight());
        System.out.println(parrot.getAge());
        System.out.println(parrot.getColour());
    }
}
