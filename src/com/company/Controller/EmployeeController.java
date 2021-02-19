package com.company.Controller;
import com.company.Repositories.IRepo.IEmployeeRepo;
import com.company.Employees;

import java.util.List;

public class EmployeeController {
    private final IEmployeeRepo repo;
    public EmployeeController(IEmployeeRepo repo) {
        this.repo = repo;
    }
    public String createEmployee(int id,int age,String name, int price,String job){ // crate employee method
        Employees employee = new Employees(id,age,name,price,job);
        boolean created= repo.createEmployee(employee);
        return (created ? "User was created!" : "User creation was failed!");
    }
    public int getEmployeeById(int id){//get user by id method
        Employees employee= repo.getEmployeeById(id);
        return Integer.parseInt((employee == null ? "User was not found!" : employee.toString()));
    }
    public String getAllEmployees(){//get all users method
        List<Employees> employee = repo.getAllEmployees();

        return employee.toString();
    }
    public int deleteEmployeeById(int id){//deleting user by id method
        Employees employee= repo.deleteById(id);
        return Integer.parseInt((employee == null ? "User has deleted" : "User was not found!"));
    }
    public String selectFrontend(){//selecting frontend developers method
        List<Employees> employee = repo.getAllFrontends();

        return employee.toString();
    }
    public String selectBackend(){//selecting backend developers method
        List<Employees> employee = repo.getAllBackends();

        return employee.toString();
    }
    public int totalCost(){//method for total salaries
        int response = repo.TotalCost();
        return response;
    }

}
