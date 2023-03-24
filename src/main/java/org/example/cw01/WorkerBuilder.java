package org.example.cw01;

public class WorkerBuilder {
    private static WorkerBuilder instance = null;
    Worker obj;

    private WorkerBuilder() {

    }

    public static WorkerBuilder getInstance() {
        if (instance == null)
            instance = new WorkerBuilder();
        instance.obj = new Worker();

        return instance;
    }

    public WorkerBuilder setName(String name) {
        obj.setName(name);
        return this;
    }



    public WorkerBuilder salary(int salary) {
        obj.setSalary(salary);
        return this;
    }

    public WorkerBuilder phoneNumber(int phoneNumber) {
        obj.setPhoneNumber(phoneNumber);
        return this;
    }
    public WorkerBuilder pabinet(byte cabinet) {
        obj.setCabinet(cabinet);
        return this;
    }



    public Worker build(){
        return obj;
    }

    @Override
    public String toString() {
        return "WorkerBuilder{" +
                "obj=" + obj +
                '}';
    }
}