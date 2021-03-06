package com.company.Repositories.IRepo;
import com.company.Employees;

import java.util.List;

public interface IEmployeeRepo { // interfaces for our queries
    boolean createEmployee(Employees employee);
    Employees getEmployeeById(int id);
    List<Employees> getAllEmployees();
    Employees deleteById(int id);
    List<Employees> getAllFrontends();
    List<Employees> getAllBackends();
    int TotalCost();
}
