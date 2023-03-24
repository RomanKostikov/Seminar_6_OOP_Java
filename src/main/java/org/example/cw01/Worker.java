package org.example.cw01;

public class Worker {
    private String name;
    private int salary;
    private boolean vacation;
    private short cabinet;
    private int phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public short getCabinet() {
        return cabinet;
    }

    public void setCabinet(short cabinet) {
        this.cabinet = cabinet;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", vacation=" + vacation +
                ", cabinet=" + cabinet +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
