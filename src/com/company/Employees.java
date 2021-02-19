package com.company.MyApp;

public class Employees  {
    private int id;
    private int age;
    private String name;
    private int price;
    private String job;
    public Employees(int id,int age, String name){
        setId(id);
        setName(name);
        setAge(age);

    }
    public Employees(int id,int age, String name,int price, String job){
        setId(id);
        setName(name);
        setAge(age);
        setPrice(price);
        setJob(job);
    }
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
    public String toString(){
        return "Employee{" + '\n'+
                "id= "+ id+ '\n'+
                "age= "+age+ '\n'+
                "name= "+name+ '\n'+
                "price= "+price + '\n' +
                "job= "+job+'}';
    }

}
