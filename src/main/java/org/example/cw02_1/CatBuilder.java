package org.example.cw02_1;

public class CatBuilder {
    private static CatBuilder instance = null;
    Cat obj;

    private CatBuilder() {

    }

    public static CatBuilder getInstance() {
        if (instance == null)
            instance = new CatBuilder();
        instance.obj = new Cat();

        return instance;
    }
    public CatBuilder setName(String name) {
        obj.setName(name);
        return this;
    }
    public CatBuilder setBreed(String breed) {
        obj.setBreed(breed);
        return this;
    }
    public CatBuilder setOwner(String owner) {
        obj.setOwner(owner);
        return this;
    }
    public CatBuilder setAge(int age) {
        obj.setAge(age);
        return this;
    }
    public CatBuilder setWeight(int weight) {
        obj.setAge(weight);
        return this;
    }
    public CatBuilder setHeight(int height) {
        obj.setAge(height);
        return this;
    }
    public CatBuilder setDate(long date) {
        obj.setDate(date);
        return this;
    }
    public Cat build() {
        return obj;
    }
}
