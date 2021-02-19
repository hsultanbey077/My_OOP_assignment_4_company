package com.company.MyApp.Controller;
import com.company.MyApp.Repositories.IRepo.IEmployeeRepo;
import com.company.MyApp.Employees;

import java.util.List;

public class EmployeeController {
    private final IEmployeeRepo repo;
    public EmployeeController(IEmployeeRepo repo) {
        this.repo = repo;
    }
    public String createEmployee(int id,int age,String name, int price,String job){
        Employees employee = new Employees(id,age,name,price,job);
        boolean created= repo.createEmployee(employee);
        return (created ? "User was created!" : "User creation was failed!");
    }
    public int getEmployeeById(int id){
        Employees employee= repo.getEmployeeById(id);
        return Integer.parseInt((employee == null ? "User was not found!" : employee.toString()));
    }
    public String getAllEmployees(){
        List<Employees> employee = repo.getAllEmployees();

        return employee.toString();
    }
    public int deleteEmployeeById(int id){
        Employees employee= repo.deleteById(id);
        return Integer.parseInt((employee == null ? "User has deleted" : "User was not found!"));
    }
    public String selectFrontend(){
        List<Employees> employee = repo.getAllFrontends();

        return employee.toString();
    }
    public String selectBackend(){
        List<Employees> employee = repo.getAllBackends();

        return employee.toString();
    }
    public int totalCost(){
        int response = repo.TotalCost();
        return response;
    }

}
