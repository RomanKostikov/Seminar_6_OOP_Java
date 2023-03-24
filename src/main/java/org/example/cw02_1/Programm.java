package org.example.cw02_1;

public class Programm {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = CatBuilder.getInstance().setName("barsik").setAge(5).setWeight(6).build();
        var cat2 = CatBuilder.getInstance().setName("cat").setBreed("brit").setDate(2022).setOwner("Vladimir").build();
        System.out.println(cat);
        System.out.println(cat2);
    }
}
