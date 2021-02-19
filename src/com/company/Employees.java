package com.company;

public class Employees  { //create entities for our project
    private int id;
    private int age;
    private String name;
    private int price;
    private String job;
    public Employees(){}  // create the first empty constructor
    public Employees(int id,int age, String name){ // crate the second constructor
        setId(id);
        setName(name);
        setAge(age);

    }
    public Employees(int id,int age, String name,int price, String job){ // create the third constructor
        setId(id);
        setName(name);
        setAge(age);
        setPrice(price);
        setJob(job);
    }
    // creating getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }



    @Override
    public String toString(){ // toString method
        return "Employee{" + '\n'+
                "id= "+ id+ '\n'+
                "age= "+age+ '\n'+
                "name= "+name+ '\n'+
                "price= "+price + '\n' +
                "job= "+job+'}';
    }

}
