package org.example.cw02_1;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String breed;
    private String owner;
    private long date;
    private int height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", owner='" + owner + '\'' +
                ", date=" + date +
                ", height=" + height +
                '}';
    }
}
